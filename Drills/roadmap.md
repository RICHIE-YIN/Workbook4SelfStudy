# 🧭 DEALERSHIP WORKSHOP PREP ROADMAP (Richie Edition)

**Goal:**  
To be 100% ready for your **Dealership Workshop**, which combines:
- Object-oriented design (classes inside classes)
- File I/O (loading inventory from CSVs)
- Static methods
- ArrayLists
- CLI menu systems

---

## ⚙️ OVERVIEW (Phases)

| Phase | Topic | Focus | Approx. Time |
|-------|-------|--------|---------------|
| 1️⃣ | Static Variables & Methods | Shared data & utilities | 30–45 min |
| 2️⃣ | Class Relationships | “Objects within objects” (Deck/Card → Dealership/Vehicle) | 1–1.5 hr |
| 3️⃣ | File Reading/Writing | Loading & saving dealership data | 30–40 min |
| 4️⃣ | CLI Menu Refresher | Practicing user input loops | 20–30 min |

---

## 🧱 PHASE 1 — Static Variables & Methods

### 🎯 Goal
Understand how some data belongs to the **class itself**, not each object.

---

### 🧩 Exercise 1 — Cat Counter

```bash
package com.pluralsight.practice1;

public class Cat {
    static int catCount = 0;   // shared across all Cats
    private String name;

    public Cat(String name){
        this.name = name;
        catCount++;
    }

    public String getName(){ return name; }
}
```

```bash
package com.pluralsight.practice1;

public class CatProgram {
    public static void main(String[] args) {
        new Cat("Leo");
        new Cat("Mimi");
        new Cat("Rocky");
        System.out.println("Total cats created: " + Cat.catCount);
    }
}
```

✅ Output:
```
Total cats created: 3
```

---

### 🧩 Exercise 2 — MathHelper Utility

```bash
package com.pluralsight.practice1;

public class MathHelper {
    public static int add(int a, int b){
        return a + b;
    }

    public static int square(int n){
        return n * n;
    }
}
```

```bash
package com.pluralsight.practice1;

public class MathProgram {
    public static void main(String[] args) {
        System.out.println(MathHelper.add(3, 5)); // 8
        System.out.println(MathHelper.square(6)); // 36
    }
}
```

---

### 🧩 Exercise 3 — Shared Settings Example

```bash
package com.pluralsight.practice1;

public class GameSettings {
    public static int volumeLevel = 5;
}
```

```bash
package com.pluralsight.practice1;

public class GameProgram {
    public static void main(String[] args) {
        System.out.println("Initial volume: " + GameSettings.volumeLevel);
        GameSettings.volumeLevel = 10;
        System.out.println("Updated volume: " + GameSettings.volumeLevel);
    }
}
```

---

## 🧩 PHASE 2 — Class Relationships (Objects within Objects)

### 🎯 Goal
Learn how classes can contain or manage other classes.  
Example: A `Dealership` *has* `Vehicles`. A `Deck` *has* `Cards`.

---

### 🃏 Exercise 1 — Card + Deck

```bash
package com.pluralsight.practice2;

public class Card {
    private String suit;
    private String value;

    public Card(String suit, String value){
        this.suit = suit;
        this.value = value;
    }

    public String getSuit(){ return suit; }
    public String getValue(){ return value; }
}
```

```bash
package com.pluralsight.practice2;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    ArrayList<Card> cards = new ArrayList<>();

    public Deck(){
        String[] suits = {"Hearts","Spades","Diamonds","Clubs"};
        String[] values = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};

        for (String suit : suits) {
            for (String value : values) {
                cards.add(new Card(suit, value));
            }
        }
        Collections.shuffle(cards);
    }

    public Card deal(){
        if(cards.size() == 0) return null;
        return cards.remove(0);
    }

    public int getSize(){
        return cards.size();
    }
}
```

```bash
package com.pluralsight.practice2;

public class DeckProgram {
    public static void main(String[] args) {
        Deck deck = new Deck();
        System.out.println("Deck size before: " + deck.getSize());
        Card card = deck.deal();
        System.out.println("You drew: " + card.getValue() + " of " + card.getSuit());
        System.out.println("Deck size after: " + deck.getSize());
    }
}
```

---

### 🚗 Exercise 2 — Vehicle + Dealership

```bash
package com.pluralsight.practice2;

public class Vehicle {
    private int vin;
    private String make;
    private String model;
    private double price;

    public Vehicle(int vin, String make, String model, double price){
        this.vin = vin;
        this.make = make;
        this.model = model;
        this.price = price;
    }

    public int getVin(){ return vin; }
    public String getMake(){ return make; }
    public String getModel(){ return model; }
    public double getPrice(){ return price; }
}
```

```bash
package com.pluralsight.practice2;

import java.util.ArrayList;

public class Dealership {
    private String name;
    private ArrayList<Vehicle> inventory = new ArrayList<>();

    public Dealership(String name){
        this.name = name;
    }

    public void addVehicle(Vehicle vehicle){
        inventory.add(vehicle);
    }

    public ArrayList<Vehicle> getInventory(){
        return inventory;
    }

    public void displayAllVehicles(){
        for (Vehicle v : inventory){
            System.out.printf("%d | %s %s | $%.2f\n",
                    v.getVin(), v.getMake(), v.getModel(), v.getPrice());
        }
    }
}
```

```bash
package com.pluralsight.practice2;

public class DealershipProgram {
    public static void main(String[] args) {
        Dealership dealership = new Dealership("Richie’s Auto");
        dealership.addVehicle(new Vehicle(1001, "Toyota", "Camry", 24999));
        dealership.addVehicle(new Vehicle(1002, "Honda", "Civic", 21999));
        dealership.displayAllVehicles();
    }
}
```

---

## 💾 PHASE 3 — File Reading/Writing Refresher

```bash
package com.pluralsight.practice3;

import java.io.*;

public class FileReaderDemo {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src/main/java/com/pluralsight/data/cars.csv"));
            String line;
            while((line = bufferedReader.readLine()) != null){
                String[] parts = line.split("\\|");
                System.out.println(parts[0] + " " + parts[1] + " costs $" + parts[2]);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
```

---

## 💻 PHASE 4 — CLI Menu Refresher

```bash
package com.pluralsight.practice4;

import java.util.Scanner;

public class MenuExample {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        while(running){
            System.out.println("1. Say Hello");
            System.out.println("2. Say Bye");
            System.out.println("3. Exit");

            String input = scanner.nextLine();
            if(input.equals("1")) System.out.println("Hello!");
            else if(input.equals("2")) System.out.println("Bye!");
            else if(input.equals("3")) running = false;
        }
    }
}
```

---

## ✅ FINAL CHECKLIST — “Workshop Readiness”

| Skill | Example You Did | Ready? |
|-------|------------------|--------|
| Classes & Objects | `TemperatureConverter`, `Deck/Card`, `Dealership/Vehicle` | ✅ |
| JUnit Basics | `BankAccountTest`, `DiceTest` | ✅ |
| Static Fields/Methods | `Cat`, `MathHelper`, `GameSettings` | ✅ |
| File Reading/Writing | `FileReaderDemo` | ✅ |
| CLI Loop Menu | `MenuExample` | ✅ |
| Class Relationships | `Deck/Card`, `Dealership/Vehicle` | ✅ |

---

## 🧱 BONUS PHASE — Practice Blueprints for Mastery

Here are hands-on blueprints to build your OOP intuition without copying full code. Fill in the blanks and create your own methods!

---

### 🏠 Exercise 1 — House + Room

**Goal:** Model a house with multiple rooms.  
**Blueprint:**
- `Room`: `name`, `squareFeet`
- `House`: `ArrayList<Room> rooms`, `addRoom(Room)`, `displayAllRooms()`, `getTotalSquareFeet()`

---

### 💳 Exercise 2 — Bank + Account

**Goal:** Create a bank that holds accounts and allows deposits.  
**Blueprint:**
- `Account`: `accountNumber`, `balance`, `deposit(double)`, `withdraw(double)`
- `Bank`: `ArrayList<Account>`, `addAccount(Account)`, `getAccountByNumber(int)`, `depositToAccount(int, double)`

---

### 🎮 Exercise 3 — Player + Inventory + Item

**Goal:** Practice nesting relationships.  
**Blueprint:**
- `Item`: `name`, `value`
- `Inventory`: `ArrayList<Item>`, `addItem(Item)`, `getTotalValue()`
- `Player`: `name`, `Inventory`, `pickupItem(Item)`, `showInventory()`

---

### ☕ Exercise 4 — CoffeeShop + Drink + Customer

**Goal:** Work with multiple lists and nested loops.  
**Blueprint:**
- `Drink`: `name`, `price`
- `Customer`: `name`, `ArrayList<Drink> order`
- `CoffeeShop`: `ArrayList<Customer>`, `calculateTotalSales()`, `findMostExpensiveDrink()`

---

### 🏪 Exercise 5 — Store + Department + Product

**Goal:** Deeply nested relationships (3 layers).  
**Blueprint:**
- `Product`: `id`, `name`, `price`
- `Department`: `name`, `ArrayList<Product>`
- `Store`: `name`, `ArrayList<Department>`, `findProductByName(String)`

---

## 💬 RECOMMENDED DAILY PLAN (OPTIONAL)

| Day | Exercise | Focus |
|-----|-----------|--------|
| 1 | House + Room | “Has-a” relationship |
| 2 | Bank + Account | Working with IDs and search logic |
| 3 | Player + Inventory | Nested classes |
| 4 | CoffeeShop | Multiple objects interacting |
| 5 | Store | Deep class composition |
| 6 | Review Deck + Card + Dealership | Compare to new blueprints |
| 7 | Build your own mini project (anything you love) | Capstone |

---

### ⚡️Remember:
- Think of **objects as nouns**, **methods as verbs**.
- When you see `ArrayList<Something>`, picture a **garage** holding those “somethings.”
- Practice looping, adding, and displaying objects until it feels like second nature.

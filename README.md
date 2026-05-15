# ☕ Java OOP Basic Guide

## 📘 Topics
- Basic Java Class & Object
- Method
- Constructor
- this Keyword
- Object Initialization
- Display Method

---

# 🔹 What is Class?

Class হলো object তৈরির blueprint।

```java
class Student {

    String name;
    int id;
}
```

এখানে `Student` একটি class।

---

# 🔹 What is Object?

Class এর variable তৈরি করাকে object বলে।

```java
Student s1 = new Student();
```

এখানে `s1` হলো object।

---

# 🔹 Method in Java

Method হলো class এর function।

```java
void display() {

    System.out.println(name);
}
```

Method দিয়ে কাজ করানো হয়।

---

# 🔹 Constructor in Java

Constructor হলো special method যা object create হওয়ার সময় automatic call হয়।

## ✅ Constructor Features

- Constructor এর নাম class এর নামের মতো হয়
- কোনো return type থাকে না
- Object create হলে automatic run হয়

---

# 🔹 Constructor Syntax

```java
class User {

    String name;

    User(String n) {

        name = n;
    }
}
```

---

# 🔹 Constructor Example

```java
class Player {

    String name;
    int number;

    Player(String n, int num) {

        name = n;
        number = num;
    }

    void display() {

        System.out.println(name);
        System.out.println(number);
    }
}
```

---

# 🔹 Object Creation Using Constructor

```java
Player p1 = new Player("Messi", 10);
```

এখানে constructor automatic call হচ্ছে।

---

# 🔹 What is `this` Keyword?

`this` keyword current object কে নির্দেশ করে।

---

# 🔹 Why Use `this`?

যখন class variable এবং parameter এর নাম একই হয় তখন `this` ব্যবহার করা হয়।

---

# 🔹 Example Without `this`

```java
class User {

    String name;

    User(String name) {

        name = name;
    }
}
```

❌ এখানে class variable update হবে না।

---

# 🔹 Correct Example Using `this`

```java
class User {

    String name;

    User(String name) {

        this.name = name;
    }
}
```

✅ এখানে:

- `this.name` → class variable
- `name` → parameter variable

---

# 🔹 Full Example

## 📄 Main Class

```java
package com.mycompany.constructorjava;

public class Constructorjava {

    public static void main(String[] args) {

        User u1 = new User("Rakib", "rakib@gmail.com", 11111);

        User u2 = new User("Tamim", "tamim@gmail.com", 22222);

        u1.display();
        u2.display();
    }
}
```

---

## 📄 User Class

```java
package com.mycompany.constructorjava;

public class User {

    String name;
    String email;
    int number;

    User(String name, String email, int number) {

        this.name = name;
        this.email = email;
        this.number = number;
    }

    void display() {

        System.out.println("Name   : " + name);
        System.out.println("Email  : " + email);
        System.out.println("Number : " + number);

        System.out.println();
    }
}
```

---

# 🔹 Output

```java
Name   : Rakib
Email  : rakib@gmail.com
Number : 11111

Name   : Tamim
Email  : tamim@gmail.com
Number : 22222
```

---

# 🔹 Constructor vs Method

| Constructor | Method |
|---|---|
| Automatic call হয় | Manual call করতে হয় |
| Return type নেই | Return type থাকতে পারে |
| Object create হলে run হয় | প্রয়োজন হলে run হয় |

---

# 🔹 Advantages of Constructor

✅ Object create করার সাথে সাথে data initialize হয়  
✅ Code clean হয়  
✅ Repeated method call লাগে না  
✅ Professional coding style  
✅ OOP concept strong হয়

---

# 🔹 Real Life Use

Constructor ব্যবহার হয়:

- Student Management System
- Banking System
- Game Development
- User Login System
- Employee Management
- E-commerce Project

---

# 🔹 Important Notes

## ✔ Default Constructor

```java
User() {

}
```

## ✔ Parameterized Constructor

```java
User(String name) {

    this.name = name;
}
```

## ✔ Multiple Constructor

```java
User() {

}

User(String name) {

    this.name = name;
}
```

এটাকে Constructor Overloading বলে।

---

# 🚀 Summary

- Class → Blueprint
- Object → Class এর variable
- Method → কাজ করার function
- Constructor → Object create হলে automatic run হয়
- `this` → Current object বুঝায়

---

# ❤️ Practice More

Practice Topics:

- Array of Objects
- Constructor Overloading
- Encapsulation
- Inheritance
- Polymorphism
- Java OOP Full Project

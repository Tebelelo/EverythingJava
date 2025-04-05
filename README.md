# neo inheritance 🚀  
Mastering Inheritance & Packages

## 📌 Project Overview
**neo-inheritance** is a hands-on Java project designed to help you understand and practice **inheritance, packages, and constructors**. By working through this project, you'll gain practical experience in object-oriented programming (OOP) while building a structured, real-world application.

## 🎯 Learning Objectives
- Understand **Java packages** and how to structure a project.
- Implement **inheritance** to create a class hierarchy.
- Use **constructors** to initialize objects efficiently.
- Explore **method overriding** and **access modifiers** in OOP.


## 📂 Project Structure
```
neo-inheritance/
│── src/
│   ├── com/company/employees/
│   │   ├── Employee.java
│   │   ├── Manager.java
│   │   ├── Developer.java
│   ├── com/company/
│   │   ├── Main.java
│── UML_Diagram.md
│[Main.java](src/main/java/com/company/employees/Main.java)── README.md
```

## 🔥 Features
✅ Organized **package structure** to mimic real-world applications.  
✅ **Base class (`Employee`)** with subclasses (`Manager`, `Developer`).  
✅ **Constructors and method overriding** for deeper OOP practice.  
✅ Simple **main method** to create and display employee objects.  

## ✅ TODOs - Implement the Project Step by Step
1. **Clone the Project:** Set it up in an IDE (e.g., IntelliJ) or manually.
2. **Create Packages:** 
   - `company.employees` for employee-related classes.
   - `company` for the main class.
3. **Implement the `Employee` Class:**
   - Define `name`, `id`, and `salary` variables.
   - Add a constructor to initialize these fields.
   - Create a `displayInfo` method to print employee details.
4. **Extend `Employee` with `Manager` and `Developer`:**
   - **Manager:** Add a `bonus` field and override `displayInfo`.
   - **Developer:** Add a `programmingLanguage` field and override `displayInfo`.
5. **Create and Run `Main.java`:**
   - Instantiate `Manager` and `Developer` objects.
   - Call `displayInfo()` on both objects.

## 🛠️ UML Diagram

![Employee Hierarchy UML Diagram](https://www.plantuml.com/plantuml/png/bP0_IWOn4CNxd6BARt7t0cAnXHQ2LfvWremXC9c4_5bOrBiROqmXY_1raybxxyURDMMCkJXMhumfmOCBx0yYU5S02xpaQCM0eAFsjfB1wZPgNpOcICWOZxgv6TxBZsl-LizTDpM5jYam7e_ovY_JBUo-PdsgZdv6GKEnatlyvgMavktVP-5NGEvf9_PXO7h14Bs9w5oTdr1CgQIMDUIdsEx-5piEUlUnBByb_cm7HQqakZZ-0W00)

## 🎯 Challenges & Practice
- Add a new subclass (e.g., `Intern` or `Director`).
- Implement an **abstract method** in `Employee` and override it in subclasses.
- Create an **interface (e.g., BonusEligible)** and implement it in `Manager`.

## 🛠️ UML Diagram for Challenges

![Challenges Hierarchy UML Diagram](https://www.plantuml.com/plantuml/png/dLBDIWCn4BxdAUROOhSF8295xA6W9vzWkZiDWSbaoS_2OdrtcyGeYuh5MtRc-vblPdSXee_9iZ8IoP-m9tXmaiAUZJP79dXL03VG8_U9CL9fhjQtCBXqQQitfNh6461lHtOpLK87Bz4RqI1egNmRYM26ygnC2CZevwBUkAlAscJqvWEtBeZ1X95nFiZ9PVF9cU7B-Xa5DVdgtEIFUT3CRUsVnFyskIxy8qt4RYI_J3zwfprQUta_eUY4ch9WW_ysKorU4VoGRoPBpoHc8XzChAkja7_xV5xrxjnrRPFBQalphLwjLRlETdk-N_vRQaSo9Cll)

## Contribution Rules
- Contributors **cannot** push directly to `main`.
- All Pull Requests must be reviewed before merging.
- **Main Branch Protection:** Direct pushes to `main` are blocked. Contributors must use feature branches and create pull requests for review.
- **Branch Protection Rules:**
  - Pull requests are **required** before merging.

### 1️⃣ Clone the Repository
```bash
git clone https://github.com/sakhileln/neo-inheritance.git
cd neo-inheritance
```
### 2️⃣ Compile &  Run on the Terminal
```bash
javac -d . src/company/*.java src/company/employees/*.java
java company.Main
```

🚀 **Level up your Java OOP skills with neo inheritance!** Happy coding! 😃


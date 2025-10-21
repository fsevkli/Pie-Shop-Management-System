# Pie Shop Management System

Object-oriented Java program implementing an inheritance hierarchy for a pie shop's inventory system.

## Overview
Manages three categories of pies (Fruit, Cream, Nut) with their respective ingredients using abstract classes and polymorphism.

## Class Structure

### Abstract Base Classes
- **Pie** - Base class for all pies
  - Properties: name, category, price, ingredients list
- **Ingredient** - Base class for ingredients
  - Properties: name, quantity, unit of measurement

### Pie Subclasses
- **FruitPie** extends Pie
  - Additional: fruit type, crust type
- **CreamPie** extends Pie
  - Additional: cream type, crust type
- **NutPie** extends Pie
  - Additional: nut type, crust type

### Ingredient Subclasses
- **Fruit** extends Ingredient
  - Additional: sweetness level
- **Nut** extends Ingredient
  - Additional: nuttiness level

### Main Class
- Stores variable-length list of pies
- Methods:
  - `addPie()` - Adds pies to inventory
  - `printAllPies()` - Displays all pie information
- Demonstrates polymorphism by storing different pie types in single collection

## Key OOP Concepts
- **Inheritance** - Pie and Ingredient hierarchies
- **Abstraction** - Abstract base classes
- **Polymorphism** - Single list stores all pie types
- **Encapsulation** - Private fields with getters/setters

## Example Output
```
Apple Pie (Fruit Pie) - $12.99
Ingredients: Apples (sweetness: 8), Graham Crust
```

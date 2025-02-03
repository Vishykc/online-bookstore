Take-home Project
=================

Backend Engineer
----------------

### Overview

This project aims to assess **object-oriented analysis and modeling skills**, **Java coding proficiency**, **code structuring**, and **API design**.

> Take your time on the task, but don’t overcomplicate it. If you submit a solution that is incomplete, the parts you decided to focus on are still relevant. Keeping the objective in mind, you are free to use whatever tools, libraries, and frameworks at your disposal.

**Please include a README** detailing:

*   Decisions you made along the way
    
*   What you focused on and why
    
*   What you didn't focus on and why
    
*   Instructions on how to run and use the program
    

The Problem - Online Bookstore
------------------------------

We need a system for managing the **inventory** and **purchase process** of an online bookstore. The system should provide the following primary functions:

1.  **Inventory management of books**
    
2.  **Purchase processing and book pricing**
    
3.  **Tracking customer loyalty points**
    

### Pricing Rules

The final purchasing price is modified according to the following factors:

*   **Book Type**
    
*   **Purchase Size**
    
*   **Loyalty Points**
    

#### Book Types

*   **New Releases**: The price is always **100%** of the base price.
    
*   **Regular Books**: The price is **100%** of the base price but can be reduced by **10%** if purchased in a **bundle of 3 books or more**.
    
*   **Old Editions**: The price is **discounted by 20%**. If purchased in a **bundle of 3 books or more**, an **additional 5% discount** applies.
    

#### Loyalty Points System

*   Customers earn **1 loyalty point** for every book purchased.
    
*   Once **10 loyalty points** are accumulated, the customer can redeem them for **one free Regular or Old Edition book**.
    
*   After redeeming the discount, the loyalty points reset to **0**.
    

### API Requirements

The system should expose a **RESTful HTTP API** that supports the following operations:

*   **Retrieve available books for purchase**
    
*   **Buy one or multiple books and calculate the total price**
    
*   **Retrieve customer loyalty points**
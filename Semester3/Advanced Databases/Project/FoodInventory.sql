-- Drop and create the database
DROP DATABASE IF EXISTS FoodInventory;
CREATE DATABASE FoodInventory;
USE FoodInventory;

-- Create the Suppliers table
CREATE TABLE Suppliers (
    SupplierID INT PRIMARY KEY,
    SupplierName VARCHAR(50),
    ContactName VARCHAR(30),
    PhoneNumber VARCHAR(12)
);

-- Create the ItemDimension table with an index on ItemID
CREATE TABLE ItemDimension (
    ItemID INT PRIMARY KEY,
    ItemName VARCHAR(30),
    Brand VARCHAR(30),
    UnitPrice DECIMAL,
    INDEX (ItemID)
);

-- Create the Waste table with a corrected FOREIGN KEY reference
CREATE TABLE Waste (
    TransactionID INT PRIMARY KEY,
    ItemID INT,
    Quantity INT,
    SaleAmount INT,
    RemainingAmount INT,
    FOREIGN KEY (ItemID) REFERENCES ItemDimension(ItemID)
);

-- Create the FoodFact table
CREATE TABLE FoodFact (
    ItemID INT PRIMARY KEY,
    TransactionID INT,
    SupplierID INT,
    Quantity INT,
    SaleAmount INT,
    SaleCost DECIMAL,
    BuyAmount INT,
    BuyCost DECIMAL,
    UnitPrice DECIMAL,
    FOREIGN KEY (TransactionID) REFERENCES Waste(TransactionID),
    FOREIGN KEY (SupplierID) REFERENCES Suppliers(SupplierID),
    FOREIGN KEY (ItemID) REFERENCES ItemDimension(ItemID)
);

-- Create the ProfitDimension table
CREATE TABLE ProfitDimension (
    ItemID INT PRIMARY KEY,
    SaleCost DECIMAL,
    BuyCost DECIMAL,
    UnitPrice DECIMAL,
    FOREIGN KEY (ItemID) REFERENCES ItemDimension(ItemID)
);

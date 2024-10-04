-- Delete Database
DROP DATABASE IF EXISTS Restaurant;
-- Create Database
CREATE DATABASE IF NOT EXISTS Restaurant;

-- Switch to the Restaurant Database
USE Restaurant;

-- Create Dimension Tables
CREATE TABLE IngredientDimension (
    IngredientID INT PRIMARY KEY,
    IngredientName VARCHAR(50),
    Category VARCHAR(30),
    UnitPrice DECIMAL(10, 2),
    PurchasePrice DECIMAL(10, 2)
);

CREATE TABLE StorageDimension (
    StorageID INT PRIMARY KEY,
    StorageType VARCHAR(30),
    Temperature VARCHAR(20),
    Humidity VARCHAR(20),
    Capacity DECIMAL(10, 2)
);

CREATE TABLE LocationDimension (
    LocationID INT PRIMARY KEY,
    SourceName VARCHAR(50),
    Country VARCHAR(50),
    Region VARCHAR(50)
);

CREATE TABLE CharacteristicsDimension (
    CharacteristicsID INT PRIMARY KEY,
    TasteProfile VARCHAR(100),
    AllergyInformation VARCHAR(100),
    Organic BOOLEAN,
    GlutenFree BOOLEAN
);

-- Create Fact Table
CREATE TABLE RestaurantFact (
    RestaurantID INT PRIMARY KEY,
    IngredientID INT,
    QuantityBought INT,
    QuantitySold INT,
    Revenue DECIMAL(10, 2),
    QuantityExpired INT,
    StorageID INT,
    CharacteristicsID INT,
    LocationID INT,
    SaleDate DATE,
    WastageDate DATE,
    FOREIGN KEY (IngredientID) REFERENCES IngredientDimension(IngredientID),
    FOREIGN KEY (StorageID) REFERENCES StorageDimension(StorageID),
    FOREIGN KEY (CharacteristicsID) REFERENCES CharacteristicsDimension(CharacteristicsID),
    FOREIGN KEY (LocationID) REFERENCES LocationDimension(LocationID)
);

-- Sample Data
-- Insert data into IngredientDimension
INSERT INTO IngredientDimension (IngredientID, IngredientName, Category, UnitPrice, PurchasePrice)
VALUES
(1, 'Potatoes', 'Vegetables', 1.00, 0.80),
(2, 'Lamb', 'Meat', 8.50, 7.00),
(3, 'Carrots', 'Vegetables', 0.80, 0.60),
(4, 'Butter', 'Dairy', 3.00, 2.50),
(5, 'Salmon', 'Seafood', 10.00, 8.00),
(6, 'Mushrooms', 'Vegetables', 2.50, 2.00),
(7, 'Oats', 'Grains', 1.20, 1.00),
(8, 'Beef', 'Meat', 9.00, 7.50),
(9, 'Apples', 'Fruits', 1.50, 1.20),
(10, 'Cheese', 'Dairy', 4.00, 3.50),
(11, 'Honey', 'Condiments', 5.00, 4.00),
(12, 'Eggs', 'Dairy', 0.90, 0.70),
(13, 'Spinach', 'Vegetables', 2.20, 1.80),
(14, 'Barley', 'Grains', 1.80, 1.50),
(15, 'Lettuce', 'Vegetables', 2.00, 1.50);

-- Insert data into StorageDimension
INSERT INTO StorageDimension (StorageID, StorageType, Temperature, Humidity, Capacity)
VALUES
(1, 'Pantry', 'Room Temp', 'Normal', 500.00),
(2, 'Freezer', '-18°C', 'Low', 300.00),
(3, 'Refrigerator', '4°C', 'Medium', 200.00),
(4, 'Dry Storage', 'Room Temp', 'Low', 700.00),
(5, 'Cool Room', '12°C', 'High', 400.00),
(6, 'Freezer', '-20°C', 'Low', 250.00),
(7, 'Refrigerator', '5°C', 'Medium', 180.00),
(8, 'Pantry', 'Room Temp', 'Normal', 550.00),
(9, 'Dry Storage', 'Room Temp', 'Low', 600.00),
(10, 'Cool Room', '10°C', 'High', 350.00),
(11, 'Freezer', '-15°C', 'Low', 280.00),
(12, 'Refrigerator', '3°C', 'Medium', 220.00),
(13, 'Dry Storage', 'Room Temp', 'Low', 800.00),
(14, 'Pantry', 'Room Temp', 'Normal', 450.00),
(15, 'Cool Room', '11°C', 'High', 320.00);

-- Insert data into LocationDimension
INSERT INTO LocationDimension (LocationID, SourceName, Country, Region)
VALUES
(1, 'Local Farmer', 'Ireland', 'Leinster'),
(2, 'Irish Seafood Co-op', 'Ireland', 'Munster'),
(3, 'Dairy Co-op', 'Ireland', 'Connaught'),
(4, 'Green Vegetable Farms', 'Ireland', 'Ulster'),
(5, 'British Meat Supplier', 'United Kingdom', 'Various'),
(6, 'French Cheese Distributor', 'France', 'Various'),
(7, 'Spanish Fruit Co-op', 'Spain', 'Various'),
(8, 'Italian Olive Oil Supplier', 'Italy', 'Various'),
(9, 'Dutch Dairy Co-op', 'Netherlands', 'Various'),
(10, 'Scottish Honey Producer', 'United Kingdom', 'Various'),
(11, 'German Egg Farm', 'Germany', 'Various'),
(12, 'Belgian Mushroom Co-op', 'Belgium', 'Various'),
(13, 'Norwegian Salmon Fisheries', 'Norway', 'Various'),
(14, 'Swedish Barley Farm', 'Sweden', 'Various'),
(15, 'Danish Lettuce Grower', 'Denmark', 'Various');

-- Insert data into CharacteristicsDimension
INSERT INTO CharacteristicsDimension (CharacteristicsID, TasteProfile, AllergyInformation, Organic, GlutenFree)
VALUES
(1, 'Starchy', 'None', TRUE, TRUE),
(2, 'Savory', 'None', TRUE, FALSE),
(3, 'Sweet', 'None', TRUE, TRUE),
(4, 'Rich', 'Lactose Intolerance', TRUE, FALSE),
(5, 'Umami', 'Fish Allergy', TRUE, TRUE),
(6, 'Earthy', 'None', TRUE, TRUE),
(7, 'Nutty', 'Gluten Intolerance', TRUE, TRUE),
(8, 'Savory', 'None', TRUE, FALSE),
(9, 'Sweet', 'None', TRUE, TRUE),
(10, 'Creamy', 'Lactose Intolerance', TRUE, FALSE),
(11, 'Sweet', 'None', TRUE, TRUE),
(12, 'Protein-Rich', 'None', TRUE, TRUE),
(13, 'Leafy', 'Oxalate Sensitivity', TRUE, TRUE),
(14, 'Nutty', 'Gluten Intolerance', TRUE, TRUE),
(15, 'Crisp', 'None', TRUE, TRUE);

-- Insert data into RestaurantFact
INSERT INTO RestaurantFact (RestaurantID, IngredientID, QuantityBought, QuantitySold, Revenue, QuantityExpired, StorageID, CharacteristicsID, LocationID, SaleDate, WastageDate)
VALUES
(1, 1, 200, 180, 180.00, 20, 1, 1, 1, '2023-01-15', '2023-01-20'),
(2, 2, 30, 25, 212.50, 5, 2, 5, 5, '2023-02-10', '2023-02-15'),
(3, 3, 150, 140, 112.00, 10, 3, 7, 8, '2023-03-05', '2023-03-10'),
(4, 4, 50, 45, 135.00, 5, 4, 8, 10, '2023-04-20', '2023-04-25'),
(5, 5, 80, 75, 150.00, 5, 5, 11, 2, '2023-05-12', '2023-05-17'),
(6, 6, 100, 90, 225.00, 10, 6, 13, 12, '2023-06-08', '2023-06-13'),
(7, 7, 120, 110, 144.00, 10, 7, 14, 7, '2023-07-25', '2023-07-30'),
(8, 8, 60, 55, 270.00, 5, 8, 1, 14, '2023-08-17', '2023-08-22'),
(9, 9, 40, 35, 60.00, 5, 9, 10, 3, '2023-09-03', '2023-09-08'),
(10, 10, 110, 100, 140.00, 10, 10, 4, 9, '2023-10-19', '2023-10-24'),
(11, 11, 65, 60, 200.00, 5, 11, 8, 11, '2023-11-14', '2023-11-19'),
(12, 12, 95, 90, 105.00, 5, 12, 2, 7, '2023-12-02', '2023-12-07'),
(13, 13, 55, 50, 120.00, 5, 13, 3, 13, '2024-01-08', '2024-01-13'),
(14, 14, 70, 65, 165.00, 5, 14, 9, 15, '2024-02-14', '2024-02-19'),
(15, 15, 85, 80, 180.00, 5, 15, 12, 9, '2024-03-21', '2024-03-26');


SELECT  
    IngredientName, 
        SUM(UnitPrice - PurchasePrice) AS TotalProfit 
FROM RestaurantFact 
JOIN IngredientDimension ON RestaurantFact.IngredientID = IngredientDimension.IngredientID 
WHERE SaleDate BETWEEN '2000-01-01' AND '3024-01-11' 
GROUP BY IngredientName; 

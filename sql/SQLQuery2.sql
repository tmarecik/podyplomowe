-- aby po³¹czyc sie z innymi bazami danych uzywamy "use"
-- pe³ana kwalifikowana nazwa bay ->  DB-SCHEMA-TABLE


--use AdventureWorks


/*
SELECT ProductID, Name, ProductNumber, Color, StandardCost 
FROM Production.Product
ORDER BY Name 
*/


/*
SELECT ProductID, Name, ProductNumber, Color, StandardCost 
FROM Production.Product
WHERE Color = 'black'
*/

/*
SELECT *
FROM Production.ProductSubcategory
-- WHERE ProductCategoryID < 10
WHERE Name != 'Mountain Bikes'
*/


-- porownywwanie ciagow znakow

/*
SELECT *
FROM Production.ProductSubcategory
WHERE Name LIKE 'c%'   -- %-zastepuje caly ciag znakow 
*/

/*
SELECT *
FROM Production.Product
--WHERE Name LIKE 'FLAT Washer _'   -- _(flor) zastepuje 1 znak
WHERE Name LIKE 'FLAT Washer[LM]'  -- zastepuje wiele znakow      
 */

 /*
 SELECT *
FROM Production.Product
WHERE not color = 'red' and ProductSubcategoryID < 2
*/


/*
 SELECT Name, Color
FROM Production.Product
--WHERE color in ('black', 'silver')
WHERE (ProductSubcategoryID = 1 and not Color='red')
or (ProductSubcategoryID = 1 and not Color='black')
ORDER BY ProductSubcategoryID, Color
*/


-- zakrs wartosc
/*
SELECT *
FROM Production.ProductSubcategory
WHERE ProductSubcategoryID >=1 and ProductSubcategoryID <4
*/

/*
SELECT *
FROM Production.ProductSubcategory
WHERE ProductSubcategoryID BETWEEN 1 and 3
*/


-- daty--
/*
select * from Sales.SalesOrderHeader
WHERE OrderDate BETWEEN '20040501' and '20040507'  --daty w pojedynczych apostrofach
*/

/*
-- NULL --
SELECT isnull(Color, 'No Color')  --isnull pozwala zastapic null jakas wartoscia i wyswietlic 
FROM Production.Product
WHERE color is NULL
*/

/*
SELECT distinct Color as Kolor   --distinct eliminiuje duplikaty 
FROM Production.Product
WHERE color is not NULL
*/

/*
SELECT TOP 10 * 
FROM Production.Product
--order by ProductID  
order by Name
*/

/*
select TOP 5 *
from HumanResources.Employee
ORDER BY ModifiedDate DESC
*/

-- operacje przy u¿yciu porocentow


/*
select TOP 10 percent *
from HumanResources.Employee
ORDER BY ModifiedDate DESC
*/

/*
select FirstName + ' ' +  LastName as 'Imiê i Nazwisko'  -- konkatenacja
from Person.Contact
*/

/*
select LEFT(FirstName,1) + LEFT(LastName,1) as 'Inicjaly' --funkcja LEFTse
from Person.Contact
*/

--select count(*) from Person.Contact

select * from dbo.test  --schemat domyslny je¿eli siê go nie poda to tez zadziala  -> select * from test



































select * from Sales.SalesOrderHeader

select SalesOrderID, OrderDate, Status 
from Sales.SalesOrderHeader
Order by ModifiedDate DESC

select ContactID, LastName, FirstName 
from Person.Contact
Order by LastName DESC, FirstName ASC

select * 
from Person.Contact
WHERE FirstName = 'Michael'
Order by LastName

select * 
from Person.Contact
WHERE FirstName != 'Michael'
AND LastName LIKE 'Ac%'


select * 
from Person.Contact
WHERE ModifiedDate BETWEEN '20030901' and '20030922'

select TOP 10 * 
from HumanResources.Employee
ORDER BY HireDate DESC 

select TOP 10 * 
from HumanResources.Employee
WHERE GENDER='F'
ORDER BY BirthDate ASC

select *
from HumanResources.Employee
WHERE Title LIKE 'Production Technician%' 
OR Title LIKE 'Tool Designer%'

select distinct Title
from HumanResources.Employee



select FirstName as Imie, LastName as Nazwisko, Phone as Telefon  
from Person.Contact
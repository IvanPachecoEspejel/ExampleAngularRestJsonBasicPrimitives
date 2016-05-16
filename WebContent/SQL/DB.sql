if not exists (select name from sys.databases where name = N'Examples')
CREATE DATABASE [Examples]

if not exists (select * from Examples.sys.tables where name = N'Employee')
CREATE TABLE [Examples].[dbo].[Employee](
    RowColumn int IDENTITY(1,1) not null primary key,
    Name varchar(50),
    Birth datetime,
    Boss int FOREIGN KEY REFERENCES Examples.dbo.Employee (RowColumn)
)
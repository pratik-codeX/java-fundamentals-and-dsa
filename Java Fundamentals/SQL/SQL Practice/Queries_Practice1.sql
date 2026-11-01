SELECT count(rno),city FROM
student 
GROUP BY city
having count(rno) >= 2;

/*Display total number of students from each mark group.*/
select mark,count(*) as total_student
from student
GROUP BY mark;

/*Display details of student having 
lowest marks*/
SELECT name, city, rno, mark
FROM student
WHERE mark = (
    SELECT MIN(mark)
    FROM student
);


/*Display total number of students 
from each mark group.*/
select mark,count(mark) from student
GROUP BY mark;

/* Display total number of 
students from each city.*/
SELECT city,count(rno) from student
GROUP BY city;
 
/*Display name of student with second maximum marks.*/
SELECT Name, mark
FROM student
WHERE mark = (
    SELECT MAX(mark)
    FROM student
    WHERE mark < (
        SELECT MAX(mark)
        FROM student
    )
);

/*Display all names of students whose name 
stats with ‘P’ and marks are
greater than 80 .*/
select name from student
where name like 'P%' and mark > 80;


/*Display Average marks of students 
from each city.*/
select city,AVG(mark) from student
GROUP BY city;


/* Display number of students in each city.*/
select city,count(city) from student
GROUP BY city;

/*Display all information of 
students whose name starts with ‘P’*/
select * from student where name like 'P%';

/*Display highest marks of student.*/
SELECT max(mark) from student;

/*Display First 5 records from table.*/
select * from student limit 5;


/* Display contents of Student table in Descending 
order by there Marks who
lives in Pune*/
SELECT * from student 
where city = 'Pune' ORDER BY mark DESC;


/* Display contents of Student table in Descending 
order by there Marks who lives in Pune.*/
select * from student 
where city = 'Pune'
ORDER BY mark DESC;


/* Display contents of Student table order by there names */
select * from student ORDER BY name;

update student set city = 'Pune'
where mark = 97 and name = 'Dhiraj';


/* Display only names and Marks of students whose Mark is greater than 90 and
Address is Satara.*/
select name , mark from student 
where mark > 90 and city = 'Satara';


/*Display only names of students who's lives in Pune.*/
select name from student 
where city = 'Pune';

SELECT * from student 
where mark = 88;

select * from student 
where mark > 80;


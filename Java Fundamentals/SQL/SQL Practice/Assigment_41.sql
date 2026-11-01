

/*21. Change all 'Java' courses to 
'Advanced Java'.*/
update student
set course = 'Java'
where course = 'Advance Java';

/*20. Delete student whose roll number is 8.*/
Delete from student
where rollno = 8;

/*19. Update marks of student 'Rohan' to 72.*/
UPDATE student 
set marks = 72
where name = 'Rohan';

/*Insert a new student: (9, 'Anjali', 'Nashik', 79, 'Python')*/
/*insert into student values(10, 'Anjali', 'Nashik', 79, 'Python','Rahul@gmail.com');*/


/*17. Add a new column email to 
the student table.*/
/*ALTER table student add email VARCHAR(100) unique;*/



/*16. List cities having more than 1 student.*/
SELECT city
FROM student
GROUP BY city 
HAVING count(rollno) > 1;

/*15. Show total and average 
marks course-wise.*/
select avg(marks),course
from student
GROUP BY course;


/*14. Show total number 
of students in each city.*/
SELECT city,count(rollno)
from student
GROUP BY city;

/*13. Find maximum, minimum, 
and average marks.*/
select min(marks),max(marks),avg(marks)
from student;



/*12. Show names of students 
having marks either 67 or 78.*/
select name,marks
from student
where marks = 67 or marks = 78;

/*11. Show all students except those 
who enrolled in ‘Java’.*/
select name,course
from student
where course != 'Java';


/*10. List students whose 
names start with ‘S’.*/
select name FROM student
having name like 'S%';

/*Find students whose marks 
are between 70 and 90.*/
select name,marks
from student
where marks > 70 and marks < 80;

/*Show total number of students.*/
select count(rollno)
from student;


/*Count how many students are enrolled 
in each course.*/
select course, count(rollno) 
from student
GROUP BY course;


/*Display names and marks of students, 
sorted by marks in descending order.*/
select name,marks from student
ORDER BY marks DESC; 

/*Show distinct cities from the student table*/
select city from student GROUP BY city; 

/*List students who are not from Nagpur.*/
SELECT name,city from student
where city != 'Nagpur';

/*Show students from Pune or Mumbai.*/
SELECT name,city from student 
where city = 'Pune' or city = 'Mumbai';

/*Show names of students who scored more than 80.*/
select name,marks from student
where marks > 80;

/*Display all records from the student table*/
select * from student;

select * from course;

/*INSERT INTO course VALUES
('Python', 12, 10000),
('Java', 10, 9500),
('C++', 8, 8000),
('Advanced Java', 14, 12000);*/

/*INSERT INTO student VALUES
(1, 'Raj', 'Pune', 85, 'Python'),
(2, 'Sneha', 'Mumbai', 90, 'Java'),
(3, 'Amit', 'Nashik', 78, 'Python'),
(4, 'Meena', 'Pune', 92, 'C++'),
(5, 'Rohan', 'Nagpur', 67, 'Java'),
(6, 'Pooja', 'Pune', 70, 'C++'),
(7, 'Nikhil', 'Mumbai', 88, 'Python'),
(8, 'Swati', 'Nagpur', 82, 'Java');
*/
DESCRIBE student;

DESCRIBE course;

/*create table course
(
    course_name VARCHAR(50) primary key,
    duration int ,
    fees int
);*/

/*create table student
(
    rollno int primary key,
    name varchar(100),
    city varchar(100),
    marks int,
    course varchar(50)
);*/


use MRV_Ass1;



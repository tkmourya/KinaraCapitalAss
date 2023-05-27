># Grid System
> The StudentGridSystem has backend APIs for a simple grid system with filtering.
It loads student details with pagination and allows server-side filtering. The documentation provides clear instructions and examples.
It ensures good performance with large datasets. 



>## PROCESS OF PROJECT

## Frontend side(client):

 * Open a web browser and enter the URL "localhost:8085" to access the project's home page.

![homepage](https://github.com/tkmourya/KinaraCapitalassignment/assets/132468329/79173d5c-319c-4e23-98b3-0fc914f82a0d)

* Fill in the student data on the home page.

![2 add data](https://github.com/tkmourya/KinaraCapitalassignment/assets/132468329/f70ffcd4-a299-4638-832d-f1c20df6c443)

* Click on the "Add Student" button.

* A message is displayed, indicating that the student has been added.


![added susss](https://github.com/tkmourya/KinaraCapitalassignment/assets/132468329/0cbe34a6-317c-4875-b736-e6425f875ff6)

* Click on a clickbutton to check the data. Use the URL "localhost:8085/student" to access this page.

![2 click](https://github.com/tkmourya/KinaraCapitalassignment/assets/132468329/4f071d62-751f-4020-82c2-6ccb0fbe964d)

* The page displays all the added student data.

![all datas](https://github.com/tkmourya/KinaraCapitalassignment/assets/132468329/3f789628-7ad1-40bc-aefc-0e0da1e1932e)

* To view data for a specific student, use the URL "localhost:8085/student/102" (replace "102" with the desired student ID).

* The page displays the data for the student with the specified ID.

![one data show](https://github.com/tkmourya/KinaraCapitalassignment/assets/132468329/b27f0229-df67-47ec-97a7-00f538a91848)

## Backend Development (Developer Site):

* To interact with the backend, you can utilize the Postman software.

* To add student data, you need to send an appropriate HTTP request (e.g., POST) to the URL "localhost:8085" in Postman.

* Ensure that the request includes the necessary data in the correct format for adding a student.

![postman add](https://github.com/tkmourya/KinaraCapitalassignment/assets/132468329/3af5e561-7ff2-499e-b909-51465daad18e)

* To retrieve data for a specific student, send a GET request to "localhost:8085/student/104" (replace "104" with the desired student ID) in Postman.

*The response will display the data for the student with the specified ID.

![postman getone](https://github.com/tkmourya/KinaraCapitalassignment/assets/132468329/7dfd869a-4eb4-456a-b151-c7da07dd8446)

* To retrieve data for all students, send a GET request to "localhost:8085/student" in Postman.

* The response will contain data for all the students.

![postman allget](https://github.com/tkmourya/KinaraCapitalassignment/assets/132468329/ea36642f-3497-4023-b447-f847a636ebe6)

## MySQL Database (DBMS & RDBMS):

* The student data is stored in a MySQL database,permanently.

* To access the database and view the data in tabular form, you need appropriate credentials and a database management tool such as MySQL Workbench or the command-line interface.

![in mysql](https://github.com/tkmourya/KinaraCapitalassignment/assets/132468329/d67d27e3-9178-49b0-b0b4-33e0a852b19f)

create table Demo_Employee (
	employeeId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	firstName VARCHAR(75) null,
	lastName VARCHAR(75) null
);
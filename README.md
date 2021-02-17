[![Build](https://github.com/haggbart/JavaEEStartProsjekt/workflows/Build/badge.svg?branch=master)](https://github.com/haggbart/JavaEEStartProsjekt/actions)


## resources.xml
```xml
<?xml version="1.0" encoding="UTF-8" ?>
<resources>
    <Resource id="postgresql" type="DataSource">
        jdbcDriver = org.postgresql.Driver
        jdbcUrl = jdbc:postgresql://data1.hib.no:5433/hStudentNr
        userName = hStudentNr
        password = pass
    </Resource>
</resources>
```

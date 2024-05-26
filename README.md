# *MyBatisTest*
***Mybatis框架笔记***
MyBatis获取参数值的两种方式：${}和#{}  
${}的本质就是字符串拼接，#{}的本质就是占位符赋值  
${}使用字符串拼接的方式拼接sql，若为字符串类型或日期类型的字段进行赋值时，需要手动加单引号；但是#{}使用占位符赋值的方式拼接sql，此时为字符串类型或日期类型的字段进行赋值时，可以自动添加单引号.:joy::joy::joy:

-------------------------------------------------------------------------------------------------------------------------------------------------------------

***自定义映射resultMap*** 
resultMap处理字段和属性的映射关系  
resultMap：设置自定义映射  
***属性***:  
id：表示自定义映射的唯一标识，不能重复  
type：查询的数据要映射的实体类的类型  
##***子标签***：  
id：设置主键的映射关系  
result：设置普通字段的映射关系  
##***子标签属性***：  
property：设置映射关系中实体类中的属性名  
column：设置映射关系中表中的字段名  
若字段名和实体类中的属性名不一致，则可以通过resultMap设置自定义映射，即使字段名和属性名一致的属性也要映射，也就是全部属性都要列出来  :joy::joy::joy:
```java
<resultMap id="empResultMap" type="Emp"> 
```
---------------------------------------------------------------------------------------------------------------------------------------------------------------


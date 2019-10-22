# Builder Pattern Demo

Simple project demonstrating **Builder Pattern** for creating instances of external classes.

In reply to a [question](https://stackoverflow.com/q/58509357/7598851) at StackOverflow

## Project Structure
 * [MyPojo](src/demo/MyPojo.java) - Simple POJO class instances of which should be created
 * [ParentObject](src/demo/ParentObject.java) - Container with a `MyPojo` field
 * [MyPojoBuilder](src/demo/MyPojoBuilder.java) - The builder itself
 
## Demo
 * [Main](src/demo/Main.java) - Builds 3 `MyPojo` instances and attach them to provided `ParentObject` instances

### Sample Output:
```log
ParentObject{myPojo=MyPojo{indicatorI=true, indicatorJ=null, indicatorK=null}}
ParentObject{myPojo=MyPojo{indicatorI=true, indicatorJ=null, indicatorK=true}}
ParentObject{myPojo=MyPojo{indicatorI=true, indicatorJ=true, indicatorK=true}}
```

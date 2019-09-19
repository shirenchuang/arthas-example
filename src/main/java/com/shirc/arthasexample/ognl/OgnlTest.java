package com.shirc.arthasexample.ognl;

import com.google.gson.Gson;
import org.springframework.stereotype.Component;

import java.util.*;

/***
 * ognl表达式
 */
public class OgnlTest {

    //测试调用静态属性
    private static String static_str = "";

    //测试调用静态方法
    public static String randUUID(){
        static_str  = UUID.randomUUID().toString();
        return static_str;
    }

    public static String getName(String name){
        return name;
    }

    //测试入参 和 返回对象
    public static Person getPerson(String name,int age){
        return new Person(name,age);
    }


    //测试返回 列表
    public static List<Person> getPeople(String name, int age){
        List<Person> people = new ArrayList<>(2);
        people.add(new Person(name,age));
        people.add(new Person(name+":2",age));
        return people;
    }

    /**测试返回对象带有List 和 对象的**/
    public static Person getPerson(String name,int age,int childNum){
        Person person = new Person(name,age);
        person.setChild(new Childs("girl",1000));
        List<Childs> childs = new ArrayList<>(childNum);
        person.setChilds(childs);
        for(int i=0;i<childNum;i++){
            childs.add(new Childs("boy",i));
        }
        return person;
    }


    /**测试入参是 对象**/
    public static Person setPerson(Person person){
        return person;
    }

    /**测试入参是简单类型列表**/
    public static List<String> getChilds(List<String> childs){

        return childs;
    }

    /**测试 获取Map对象 **/
    public static Map<String,Childs> getMap(){
        HashMap<String,Childs> map = new HashMap<>();
        map.put("shirc",new Childs("boy",18));
        map.put("shizz",new Childs("girl",22));
        return map;
    }

    /**测试 获取Map对象 和入参对象为map **/
    public static Map<String,Childs> getMap(HashMap map){
        return map;
    }


    /**测试入参是负责对象**/
    public static Shirc inputObj(Shirc shirc){

        return shirc;
    }




    static class Person{
        private String name;

        private Integer age;

        private Childs child;

        private List<Childs> childs;

        public Person() {
        }

        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public List<Childs> getChilds() {
            return childs;
        }

        public void setChilds(List<Childs> childs) {
            this.childs = childs;
        }

        public Childs getChild() {
            return child;
        }

        public void setChild(Childs child) {
            this.child = child;
        }


    }


    static class Childs{
        private String sex;

        private int childAge;

        public Childs(String sex, int childAge) {
            this.sex = sex;
            this.childAge = childAge;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public int getChildAge() {
            return childAge;
        }

        public void setChildAge(int childAge) {
            this.childAge = childAge;
        }
    }

}

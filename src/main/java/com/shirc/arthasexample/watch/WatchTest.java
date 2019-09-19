package com.shirc.arthasexample.watch;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

/**
 * watch 命令的使用
 */
public class WatchTest {

    private static Integer STATIC_INT = 0;

    static class Family{

        /**爸爸名字**/
        private String fatherName;

        /**家庭年收入**/
        private Double annualIncome;

        /**孩子**/
        private List<Children> childrenList;

        public String getFatherName() {
            return fatherName;
        }

        public void setFatherName(String fatherName) {
            this.fatherName = fatherName;
        }



        public Double getAnnualIncome() {
            return annualIncome;
        }

        public void setAnnualIncome(Double annualIncome) {
            this.annualIncome = annualIncome;
        }

        public List<Children> getChildrenList() {
            return childrenList;
        }

        public void setChildrenList(List<Children> childrenList) {
            this.childrenList = childrenList;
        }
    }

    static class Children{

        private String name;
        private int aget;

        public Children(String name, int aget) {
            this.name = name;
            this.aget = aget;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAget() {
            return aget;
        }

        public void setAget(int aget) {
            this.aget = aget;
        }
    }

    /**
     * 生个孩子
     */
    private static Family bornAChild(String fatherName,Double annualIncome,String childName){
        Family family = new Family();
        family.setFatherName(fatherName);
        family.setAnnualIncome(annualIncome);
        Children children1 = new Children(childName,0);
        List childrens = new ArrayList(1);
        childrens.add(children1);
        family.setChildrenList(childrens);
        return family;
    }

    public static void main(String[] args) throws InterruptedException {
        int i = 1;
        while (true){

            //每3秒执行一下,方便用watch查看
            Thread.sleep(3000);
            Family family = bornAChild("shirenchuang",10000.0,"shi"+i+".0");
            i++;

            //watch命令可以直接访问静态属性和静态方法
            STATIC_INT++;
        }
    }


    /**watch 直接访问静态方法**/
    private static String staticMethod(){

        return UUID.randomUUID().toString();
    }

}

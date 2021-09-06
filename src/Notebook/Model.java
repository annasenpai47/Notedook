package Notebook;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Model {

    private String nick, com;
    private Group group;
    private String mod_tel, mod_tel_add, dom_tel, skype, email;
    private String address, FIO, date;


    public void setFIO(String surName, String name, String batko){
        FIO = transFIO(surName, name, batko);
    }

    public void setAddress(String index, String city, String street, String dom, String kv){
        address = transAddress(index, city, street, dom, kv);
    }

    public void setNick(String nick){
        this.nick = nick;
    }

    public void setCom(String com){
        this.com = com;
    }

    public void setGroup(Group group, int i){
        this.group = group;
        group.setCourse(i);
    }

    public void setMod_tel (String s){
        mod_tel = s;
    }

    public void setMod_tel_add (String s){
        mod_tel_add = s;
    }

    public void setDom_tel (String s){
        dom_tel = s;
    }

    public void setEmail (String s){
        email = s;
    }

    public void setSkype(String s){
        skype = s;
    }

    public void setDate(){
        String s = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
        date = s;
    }

    public String transFIO(String surName, String name, String batko){
        String s = surName.toUpperCase().charAt(0) + surName.substring(1).trim() + " "
                + name.toUpperCase().charAt(0)+". " + batko.toUpperCase().charAt(0) + ".";
        return s;
    }

    public String transAddress(String index, String city, String street, String dom, String kv){
        String s ="" + index + " " + city.toUpperCase().charAt(0) + city.substring(1).trim()+ " "
                + street.toUpperCase().charAt(0) + street.substring(1).trim() + " " + dom + " ";
        if (!kv.equals("-")){
            s+=kv;
        }
        return s;
    }


    public void printInfo(){
        System.out.println(FIO + " " + nick + " " + com);
        System.out.println(group.name() + "-" + group.getCourse());
        System.out.println(dom_tel);
        System.out.println(mod_tel);
        if(!mod_tel_add.equals("-")){
            System.out.println(mod_tel_add);
        }
        System.out.println(skype + " " + email);
        System.out.println(address);
        System.out.println(date);
    }

}

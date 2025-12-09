package com.hhit.staticProxy;

public class PersonSun implements ChangeAppearance{
   private PersonGao personGao;
    @Override
    public void changeAppearance() {
       if(personGao==null){
           personGao = new PersonGao();
       }
       personGao.changeAppearance();
       battle();
       grab();
    }
    public void battle(){
        System.out.println("和猪八戒战斗");
    }
    public void grab(){
        System.out.println("抓住猪八戒");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyClasses;

/**
 *
 * @author User
 */
public class UserNation {
    private String name ,add,mob,gen,em,nat;

    public UserNation(String name, String add, String mob, String gen, String em, String nat) {
        this.name = name;
        this.add = add;
        this.mob = mob;
        this.gen = gen;
        this.em = em;
        this.nat = nat;
    }

    public String getName() {
        return name;
    }

    public String getAdd() {
        return add;
    }

    public String getMob() {
        return mob;
    }

    public String getGen() {
        return gen;
    }

    public String getEm() {
        return em;
    }

    public String getNat() {
        return nat;
    }
    
}

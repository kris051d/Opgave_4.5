package com.company;

public class Main {

    public static void zoop(String fred, int bob) {
        System.out.println(fred);
        if (bob == 5) {
            ping("not ");
        } else {
            System.out.println("!");
        }
    }
    public static void main(String[] args) {
        int bizz = 5;
        int buzz = 2;
        zoop("just for", bizz);
        clink(2 * buzz);
    }
    public static void clink(int fork) {
        System.out.print("It's ");
        zoop("breakfast ", fork);
    }
    public static void ping(String strangStrung) {
        System.out.println("any " + strangStrung + "more ");
    }
}

//Opgave 5. zoop bliver invoket 2. gang i 13 state eller state "clink"

// Complete output is
// just for
// any not more
// It's

//Main
//bizz
//buzz
//1. zoop "just for"
//print (fred)
//if (bob)
//ping strangstrung - print "not"
//print (strangstrung)
//else
//print (!)
//clink
//print (it's)
//2. zoop
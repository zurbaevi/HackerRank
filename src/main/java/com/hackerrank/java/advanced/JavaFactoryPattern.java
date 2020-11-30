package com.hackerrank.java.advanced;

import java.security.Permission;
import java.util.Scanner;

/**
 * @author Zurbaevi Nika
 */
public class JavaFactoryPattern {
    public static void main(String[] args) {
        Do_Not_Terminate.forbidExit();
        try {
            Scanner sc = new Scanner(System.in);
            FoodFactory foodFactory = new FoodFactory();
            Food food = foodFactory.getFood(sc.nextLine());
            System.out.println("The factory returned " + food.getClass());
            System.out.println(food.getType());
        } catch (Do_Not_Terminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }

    interface Food {
        public String getType();
    }

    static class Pizza implements Food {
        public String getType() {
            return "Someone ordered a Fast Food!";
        }
    }

    static class Cake implements Food {

        public String getType() {
            return "Someone ordered a Dessert!";
        }
    }

    static class FoodFactory {
        public Food getFood(String order) {

            if (order.equalsIgnoreCase("Pizza")) {
                return new Pizza();
            } else if (order.equalsIgnoreCase("Cake")) {
                return new Cake();
            }
            return null;

        }
    }

    static class Do_Not_Terminate {

        public static void forbidExit() {
            final SecurityManager securityManager = new SecurityManager() {
                @Override
                public void checkPermission(Permission permission) {
                    if (permission.getName().contains("exitVM")) {
                        throw new ExitTrappedException();
                    }
                }
            };
            System.setSecurityManager(securityManager);
        }

        public static class ExitTrappedException extends SecurityException {
            private static final long serialVersionUID = 1L;
        }
    }
}

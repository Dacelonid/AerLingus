/*------------------------------------------------------------------------------
 *******************************************************************************
 * COPYRIGHT Ericsson 2015
 *
 * The copyright to the computer program(s) herein is the property of
 * Ericsson Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *******************************************************************************
 *----------------------------------------------------------------------------*/
package com.dacelonid.aerlingus;

import java.util.Scanner;

public class MainClass {

    public static void main(final String[] args) {

        try (final Scanner sc = new Scanner(System.in)) {
            int choiceentry = -1;

            while (choiceentry != 99) {
                printMenu();
                choiceentry = getEntry(sc, choiceentry);

                switch (choiceentry) {
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                }
            }
        }
    }

    private static void printMenu() {
        System.out.printf("Please make your choice %n");
        System.out.printf("1) Add customer%n");
        System.out.printf("2) List all customers%n");
        System.out.printf("3) Delete a customer%n");
        System.out.printf("99) exit%n==>");
    }

    private static int getEntry(final Scanner sc, int choiceentry) {
        if (sc.hasNextInt()) {
            choiceentry = sc.nextInt();
        }
        return choiceentry;
    }

}

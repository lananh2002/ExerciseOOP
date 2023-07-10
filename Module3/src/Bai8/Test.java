package Bai8;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Management management = new Management(100);

        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Them mot nguoi ");
            System.out.println("2. Xoa mot nguoi ");
            System.out.println("3. Sap xep theo ho ten ");
            System.out.println("4. xuat danh sach ");
            System.out.println("5. Thoat ");
            System.out.print("Vui long chon so :  ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Select person type:");
                    System.out.println("1. Student");
                    System.out.println("2. Employee");
                    System.out.println("3. Customer");
                    System.out.print("Enter person type: ");
                    int personType = scanner.nextInt();
                    scanner.nextLine(); 

                    System.out.print("Enter full name: ");
                    String fullName = scanner.nextLine();
                    System.out.print("Enter address: ");
                    String address = scanner.nextLine();

                    if (personType == 1) {
                        System.out.print("Enter grade 1: ");
                        double grade1 = scanner.nextDouble();
                        System.out.print("Enter grade 2: ");
                        double grade2 = scanner.nextDouble();
                        management.addPerson(new Student(fullName, address, grade1, grade2));
                    } else if (personType == 2) {
                        System.out.print("Enter salary coefficient: ");
                        double salaryCoefficient = scanner.nextDouble();
                        management.addPerson(new Employee(fullName, address, salaryCoefficient));
                    } else if (personType == 3) {
                        System.out.print("Enter company name: ");
                        String companyName = scanner.nextLine();
                        System.out.print("Enter invoice value: ");
                        double invoiceValue = scanner.nextDouble();
                        scanner.nextLine(); // Consume newline character
                        management.addPerson(new Customer(fullName, address, companyName, invoiceValue));
                    } else {
                        System.out.println("Invalid person type.");
                    }
                    break;
                case 2:
                    System.out.print("Enter the full name of the person to remove: ");
                    String fullNameToRemove = scanner.nextLine();
                    management.removePerson(fullNameToRemove);
                    break;
                case 3:
                    management.sortPeople();
                    break;
                case 4:
                    management.displayPeople();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 5);

        scanner.close();
    }
}
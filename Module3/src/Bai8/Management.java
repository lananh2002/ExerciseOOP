package Bai8;

import java.util.Arrays;

class Management {
    private Person[] people;
    private int count;

    public Management(int n) {
        people = new Person[n];
        count = 0;
    }

    public void addPerson(Person person) {
        if (count < people.length) {
            people[count] = person;
            count++;
            System.out.println("Người được thêm thành công");
        } else {
            System.out.println("Không the them người khac");
        }
    }

    public void removePerson(String fullName) {
        for (int i = 0; i < count; i++) {
            if (people[i].fullName.equals(fullName)) {
                for (int j = i; j < count - 1; j++) {
                    people[j] = people[j + 1];
                }
                count--;
                System.out.println("Da xoa thanh cong ");
                return;
            }
        }
        System.out.println("Person not found.");
    }

    public void sortPeople() {
        Arrays.sort(people, 0, count, (p1, p2) -> p1.fullName.compareToIgnoreCase(p2.fullName));
        System.out.println("Xap xep thanh cong");
    }

    public void displayPeople() {
        if (count > 0) {
            System.out.println("Danh sach : ");
            for (int i = 0; i < count; i++) {
                System.out.println("Person " + (i + 1) + ":\n" + people[i] + "\n");
            }
        } else {
            System.out.println("khong co nguoi trong danh sach");
        }
    }
}

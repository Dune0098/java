package phonebook;

import java.util.ArrayList;

public class PhoneBookList implements PhoneBook {
    final ArrayList<Person> phonebook;

    public PhoneBookList() {
        phonebook = new ArrayList<>();
    }


    @Override
    public boolean addPerson(Person p) {
        if(phonebook.contains(p) || phonebook.size() >= MAX_PERSONS){
            return false;
        }
        return phonebook.add(p);
    }

    @Override
    public boolean removePerson(Person p) {
        return phonebook.remove(p);
    }

    @Override
    public Person[] searchByLastname(String lastname) {
        ArrayList<Person> res = new ArrayList<>();

        for (Person person : phonebook) {
            if (person.lastname().equals(lastname)) {
                res.add(person);
            }
        }

        return res.toArray(new Person[]{});
    }

    @Override
    public Person[] searchByNameAndLastname(String name, String lastname) {
        ArrayList<Person> res = new ArrayList<>();
        for(Person person : phonebook){
            if(person.lastname().equals(lastname) && person.name().equals(name)){
                res.add(person);
            }
        }

        return res.toArray(new Person[]{});
    }
}

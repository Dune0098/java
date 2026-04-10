package phonebook;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PhoneBookArray implements PhoneBook {
    private final Person[] phoneBook;

    public PhoneBookArray() {
        phoneBook = new Person[MAX_PERSONS];
    }

    @Override
    public boolean addPerson(Person p) {
        for(Person person : phoneBook){
            if(p.equals(person)){
                System.out.println("Element is already present");
                return false;
            }
        }

        for(int i = 0; i < MAX_PERSONS; i++){
            if(phoneBook[i] == null){
                phoneBook[i] = p;
                System.out.println("Inserted element at index: " + i    );
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean removePerson(Person p) {
        for(int i = 0; i < MAX_PERSONS; i++){
            if(phoneBook[i] != null && phoneBook[i].equals(p)){
                phoneBook[i] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public Person[] searchByLastname(String lastname) {
        int j = 0;
        Person[] res = new Person[256];
        for(int i = 0; i < MAX_PERSONS; i++){
            if(phoneBook[i] != null && phoneBook[i].lastname().equals(lastname)){
                res[j++] = phoneBook[i];
            }
        }
        return Arrays.copyOf(res, j);
    }

    @Override
    public Person[] searchByNameAndLastname(String name, String lastname) {
        Person[] res = new Person[256];
        int j = 0;
        for(int i = 0; i < MAX_PERSONS; i++){
            if(phoneBook[i] != null
                    && phoneBook[i].name().equals(name)
                    && phoneBook[i].lastname().equals(lastname)){
                res[j++] = phoneBook[i];
            }
        }
        return Arrays.copyOf(res, j);
    }
}

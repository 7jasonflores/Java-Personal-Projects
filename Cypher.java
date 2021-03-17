//Class:		CSE 1322L
//Section: 		04
//Term:			Fall 2020
//Instructor:	Joseph Tierno
//Name:			Jason Flores
//Assignment#:			1

/*
 */

public class Cypher
{
     private String original;
     private String encrypted;
     private String decrypted;

    Cypher()
    {
        this.original = "cypher";
                     //  012345
    }

    Cypher(String user)
    {
        original = user;
    }

     public String cypherMethod(String original)
    {
        String odd = original.charAt(0) + original.substring(2,3) + original.charAt(4);
        String even = original.charAt(1) + original.substring(3,4) + original.substring(5);
        encrypted = odd + even;

        return encrypted;
    }

    String reverseMethod(String encrypted)
    {
        String rev = encrypted.charAt(0) + encrypted.substring(3,4) + encrypted.charAt(1)
                + encrypted.charAt(4) + encrypted.charAt(2) + encrypted.substring(5);

        return decrypted;
    }

    @Override
    public String toString()
    {
        return "Encrypted: " + encrypted + "\nDecrypted: " + decrypted;
    }

}

package string;

public class BufferString {
        public static void main(String[] args) {
            // Create a StringBuffer object
            StringBuffer stringBuffer = new StringBuffer();

            // Append strings to the StringBuffer
            stringBuffer.append("Hello");
            stringBuffer.append(" ");
            stringBuffer.append("World");

            // Insert a string at a specific position
            stringBuffer.insert(5, "Awesome ");

            // Replace a portion of the string
            stringBuffer.replace(0, 5, "Greetings");

            // Delete a portion of the string
            stringBuffer.delete(5, 14);

            // Print the final result
            System.out.println(stringBuffer.toString());
        }

}

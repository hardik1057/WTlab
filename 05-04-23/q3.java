// public class q3 {
//     public static void main(String[] args) {
//         StringBuffer sb = new StringBuffer("Java is my favorite Programming Language");
//         sb.append("!");
//         System.out.println("After appending: " + sb);
//         sb.insert(12, "really ");
//         System.out.println("After inserting: " + sb);
//         sb.delete(12, 18);
//         System.out.println("After deleting: " + sb);
//         int oldCapacity = sb.capacity();
//         sb.ensureCapacity(oldCapacity * 2);
//         System.out.println("After ensuring capacity: " + sb);
//         int newCapacity = sb.capacity();
//         System.out.println("New capacity: " + newCapacity);
//         sb.reverse();
//         System.out.println("After reversing: " + sb);
//     }
// }
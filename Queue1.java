import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue1 {
    public static void main(String[] args) {
        Queue<String> toDoList = new LinkedList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah pekerjaan");
            System.out.println("2. Tampilkan pekerjaan yang harus diselesaikan");
            System.out.println("3. Selesai mengerjakan pekerjaan");
            System.out.println("4. Tampilkan seluruh isi to-do list");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int menu = scanner.nextInt();
            scanner.nextLine(); // Membuang newline character

            switch (menu) {
                case 1:
                    System.out.print("Masukkan nama pekerjaan: ");
                    String task = scanner.nextLine();
                    toDoList.add(task);
                    System.out.println("Pekerjaan berhasil ditambahkan ke to-do list.");
                    break;
                case 2:
                    if (toDoList.isEmpty()) {
                        System.out.println("To-do list kosong.");
                    } else {
                        System.out.println("Pekerjaan yang harus diselesaikan terlebih dahulu:");
                        System.out.println(toDoList.peek());
                    }
                    break;
                case 3:
                    if (toDoList.isEmpty()) {
                        System.out.println("To-do list kosong.");
                    } else {
                        System.out.println("Pekerjaan " + toDoList.poll() + " telah diselesaikan dan dihapus dari to-do list.");
                    }
                    break;
                case 4:
                    if (toDoList.isEmpty()) {
                        System.out.println("To-do list kosong.");
                    } else {
                        System.out.println("Isi to-do list:");
                        for (String taskItem : toDoList) {
                            System.out.println("- " + taskItem);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    System.exit(0);
                default:
                    System.out.println("Pilihan menu tidak valid.");
            }
        }
    }
}

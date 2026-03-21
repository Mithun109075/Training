package Day10;
import java.util.LinkedList;
import java.util.Queue;

class PrintJob {
    String document;

    PrintJob(String document) {
        this.document = document;
    }
}

public class PrinterQueue {
    Queue<PrintJob> queue = new LinkedList<>();

    // Add print job
    public void addJob(String doc) {
        queue.add(new PrintJob(doc));
        System.out.println("Added: " + doc);
    }

    // Process print job
    public void printJob() {
        if (queue.isEmpty()) {
            System.out.println("No jobs in queue");
            return;
        }

        PrintJob job = queue.poll();
        System.out.println("Printing: " + job.document);
    }

    // Display queue
    public void displayQueue() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Pending jobs: ");
        for (PrintJob job : queue) {
            System.out.print(job.document + " -> ");
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        PrinterQueue pq = new PrinterQueue();

        pq.addJob("File1.pdf");
        pq.addJob("Image.png");
        pq.addJob("Report.docx");

        pq.displayQueue();

        pq.printJob();
        pq.printJob();

        pq.displayQueue();
    }
}
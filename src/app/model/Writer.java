package app.model;

public class Writer {

    private Producer producer;

    public Writer(Producer producer) throws IllegalArgumentException{
        setProducer(producer);
    }

    public void setProducer(Producer producer) throws IllegalArgumentException{
        if(producer == null) throw new IllegalArgumentException("Producer cannot be null");
        this.producer = producer;
    }

    public void run(){
        try{
            String buf;
            while((buf = producer.produce()) != null){
                System.out.println("Got message: \"" + buf + "\"");
            }
        }catch (Exception e){
            System.out.println("The following exception occurred: " + e.getMessage());
        }
    }
}

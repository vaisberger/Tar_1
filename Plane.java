public class Plane implements Movable, Comparable{
    public static final int HEIGHT_LIMIT = 1500;
    int licenceNumber;
    Location source, destination;
    int maximalHeight;

    public Plane(int id, Location src, Location dst, int maxHeight) {
        licenceNumber = id;
        source = src;
        destination = dst;
        maximalHeight = maxHeight;
    }

    @Override
    public String toString() {
        return String.format("licence = %d, source = %s, destination = %s, maxHeight = %d",
                licenceNumber, source, destination, maximalHeight);
    }

    @Override
    public String getType() {
        return "Plane";
    }

    @Override
    public int getId() {
        return licenceNumber;
    }

    @Override
    public Location getSource() {
        return source;
    }// המקור

    @Override
    public Location getDestination() {
        return destination;
    }//יעד

    @Override
    public String getCurrentLocation() {
        return getSource().toString();
    }

    @Override
    public void move() {
        Location swap=this.destination;
        this.destination=this.source;
        this.source=swap;
    }

    @Override
    public int compareTo(Object o) {
        Plane newP=(Plane)o;
        return  Integer.compare(this.maximalHeight,newP.maximalHeight);
    }}

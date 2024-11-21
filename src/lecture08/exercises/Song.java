package lecture08.exercises;

public class Song implements Comparable<Song> {
    private String singer, title;
    private int duration; // Duration in seconds

    // Constructor
    public Song(String singer, String title, int duration) {
        this.singer = singer;
        this.title = title;
        this.duration = duration;
    }

    // getters and setters
    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    // Override equals to compare singer, title and duration
    @Override
    public boolean equals(Object obj) {
        boolean result = false;
        if (obj != null) {
            if (this.getClass() == obj.getClass()) {
                Song other = (Song) obj;
                result = this.singer.equals(other.singer) && this.title.equals(other.title) && this.duration == other.duration;
            }
        }
        return result;
    }

    // Implement compareTo to sort by singer, title and duration
    @Override
    public int compareTo(Song other) {
        // Compare singers lexicographically
        int singerComparison = this.singer.compareTo(other.singer);
        if (singerComparison != 0) {
            return singerComparison;
        }

        // Compare titles lexicographically
        int titleComparison = this.title.compareTo(other.title);
        if (titleComparison != 0) {
            return titleComparison;
        }
        // Compare by duration
        return this.duration - other.duration;
    }

    // Override toString for convenient display of Song instances
    @Override
    public String toString() {
        return "Song{" +
                "singer='" + singer + '\'' +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }
}

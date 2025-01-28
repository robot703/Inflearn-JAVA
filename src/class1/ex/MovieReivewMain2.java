package class1.ex;

public class MovieReivewMain2 {

    public static void main(String[] args) {
        MovieReivew[] reviews = new MovieReivew[2];

        MovieReivew inception = new MovieReivew();
        inception.title = "인셉션";
        inception.review = "인생은 무한 루프";

        MovieReivew aboutTime = new MovieReivew();
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "인생 시간 영화";

        reviews[0] = inception;
        reviews[1] = aboutTime;

        for (MovieReivew m : reviews){
            System.out.println("영화 제목 : "+m.title + ", 리뷰 : "+ m.review);
        }
    }
}

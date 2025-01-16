package facade;

// Client
public class Main {
  public static void main(String[] args) {
    VideoPlayerFacade videoPlayer = new VideoPlayerFacade();
    videoPlayer.playVideo("video.mp4");

    /**
     // alternative
    FileLoader fileLoader = new FileLoader();
    Renderer renderer = new Renderer();
    Decoder codec = new Decoder();
    VideoPlayerFacade videoPlayer2 = new VideoPlayerFacade(fileLoader, codec, renderer);
    videoPlayer2.playVideo("video2.mp4");
     */
  }
}

package facade;

// Facade
public class VideoPlayerFacade {
  private FileLoader fileLoader;
  private Decoder decoder;
  private Renderer renderer;

  public VideoPlayerFacade() {
    this.fileLoader = new FileLoader();
    this.decoder = new Decoder();
    this.renderer = new Renderer();
  }

  /**
  // alternative
  public VideoPlayerFacade(FileLoader fileLoader, Decoder decoder, Renderer renderer) {
    this.fileLoader = fileLoader;
    this.decoder = decoder;
    this.renderer = renderer;
  }
   */

  // + do()
  public void playVideo(String fileName) {
    fileLoader.loadFile(fileName);
    decoder.decodeFile(fileName);
    renderer.renderVideo();
  }
}
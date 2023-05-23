 /**
  * application.
  *
  */
public class OnlineArticle extends OnlineTextItem
{
   private int wordCount;

/**
  * constructor method.
  * @param nameIn product name
  * @param priceIn productPrice
  */   
   public OnlineArticle(String nameIn, double priceIn)
   {
      super(nameIn, priceIn);
      wordCount = 0;
   }

/**
  * sets the word count.
  * @param wordCountIn input count
  */   
   public void setWordCount(int wordCountIn)
   {
      wordCount = wordCountIn;
   }
}
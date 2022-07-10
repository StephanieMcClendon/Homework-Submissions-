public class Sentence
{
    private String sentence;

    public Sentence (String sentence)
    {
        this.sentence = sentence;
    }
     public String getSentence() // specify the return type for a getter
     {
        return this.sentence;
     }

    public void setSentence(String sentence)// return void for setters because nothing is getting returned
    {
          this.sentence = sentence;
    }
     @Override
    public boolean equals(Object x)
     {
         if (x==this.sentence)
         {
             return true;
         }
         else
         {
             return false;
         }
     }

}

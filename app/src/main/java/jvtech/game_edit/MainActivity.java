package jvtech.game_edit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView deck1_text,deck2_text,deck3_text,message;
    RelativeLayout deckContainer,buttonContainer;
    Button deck1,deck2,deck3,done;
    int a[]=new int[21];
    int x=0;
    int[] d1=new int[7];
    int[] d2=new int[7];
    int[] d3=new int[7];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        deck1_text=(TextView)findViewById(R.id.deck1_text);
        deck2_text=(TextView)findViewById(R.id.deck2_text);
        deck3_text=(TextView)findViewById(R.id.deck3_text);
        message=(TextView)findViewById(R.id.message);
        deckContainer=(RelativeLayout)findViewById(R.id.deckContainer);
        buttonContainer=(RelativeLayout)findViewById(R.id.buttons_container);
        done=(Button)findViewById(R.id.done);
        deck1=(Button)findViewById(R.id.deck1);
        deck2=(Button)findViewById(R.id.deck2);
        deck3=(Button)findViewById(R.id.deck3);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                message.setText(R.string.message_2);
                deckContainer.setVisibility(View.VISIBLE);
                buttonContainer.setVisibility(View.VISIBLE);
                done.setVisibility(View.GONE);
            }
        });
        for (int i = 0; i < a.length; i++) {
            a[i]=i+1;
        }
        for(int i=0;i<a.length;i++)
        {
            if(i%3==0)
            {
                int a1=(i/3)+(i%3);
                d1[a1]=a[i];
            }
            else if(i%3==1)
            {
                int a1=(i/3);
                d2[a1]=a[i];
            }
            else
            {
                int a1=(i/3);
                d3[a1]=a[i];
            }
        }
        for(int i=0;i<d1.length;i++)
        {
            deck1_text.setText(deck1_text.getText().toString()+"\n"+Integer.toString(d1[i]));
            deck2_text.setText(deck2_text.getText().toString()+"\n"+Integer.toString(d2[i]));
            deck3_text.setText(deck3_text.getText().toString()+"\n"+Integer.toString(d3[i]));
        }
        deck1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ++x;
                for(int i=0;i<a.length;i++)
                {
                    if(i<7)
                    {
                        a[i]=d2[i];
                    }
                    else if(i>=7 && i<14)
                    {
                        a[i]=d1[i%7];
                    }
                    else
                    {
                        a[i]=d3[i%7];
                    }
                }
                for(int i=0;i<a.length;i++)
                {
                    if(i%3==0)
                    {
                        int a1=(i/3)+(i%3);
                        d1[a1]=a[i];
                    }
                    else if(i%3==1)
                    {
                        int a1=(i/3);
                        d2[a1]=a[i];
                    }
                    else
                    {
                        int a1=(i/3);
                        d3[a1]=a[i];
                    }
                }
                deck1_text.setText("Deck 1:");
                deck2_text.setText("Deck 2:");
                deck3_text.setText("Deck 3:");
                for(int i=0;i<d1.length;i++)
                {
                    deck1_text.setText(deck1_text.getText().toString()+"\n"+Integer.toString(d1[i]));
                    deck2_text.setText(deck2_text.getText().toString()+"\n"+Integer.toString(d2[i]));
                    deck3_text.setText(deck3_text.getText().toString()+"\n"+Integer.toString(d3[i]));
                }
                if(x==3)
                {
                    Intent i=new Intent(MainActivity.this,Result.class);
                    i.putExtra("resu",Integer.toString(a[10]));
                    x=0;
                    startActivity(i);
                }
            }
        });
        deck2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ++x;
                for(int i=0;i<a.length;i++)
                {
                    if(i<7)
                    {
                        a[i]=d1[i];
                    }
                    else if(i>=7 && i<14)
                    {
                        a[i]=d2[i%7];
                    }
                    else
                    {
                        a[i]=d3[i%7];
                    }
                }
                for(int i=0;i<a.length;i++)
                {
                    if(i%3==0)
                    {
                        int a1=(i/3)+(i%3);
                        d1[a1]=a[i];
                    }
                    else if(i%3==1)
                    {
                        int a1=(i/3);
                        d2[a1]=a[i];
                    }
                    else
                    {
                        int a1=(i/3);
                        d3[a1]=a[i];
                    }
                }
                deck1_text.setText("Deck 1:");
                deck2_text.setText("Deck 2:");
                deck3_text.setText("Deck 3:");
                for(int i=0;i<d1.length;i++)
                {
                    deck1_text.setText(deck1_text.getText().toString()+"\n"+Integer.toString(d1[i]));
                    deck2_text.setText(deck2_text.getText().toString()+"\n"+Integer.toString(d2[i]));
                    deck3_text.setText(deck3_text.getText().toString()+"\n"+Integer.toString(d3[i]));
                }
                if(x==3)
                {
                    Intent i=new Intent(MainActivity.this,Result.class);
                    i.putExtra("resu",Integer.toString(a[10]));
                    x=0;
                    startActivity(i);
                }
            }

        });
        deck3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ++x;
                for(int i=0;i<a.length;i++)
                {
                    if(i<7)
                    {
                        a[i]=d1[i];
                    }
                    else if(i>=7 && i<14)
                    {
                        a[i]=d3[i%7];
                    }
                    else
                    {
                        a[i]=d2[i%7];
                    }
                }
                for(int i=0;i<a.length;i++)
                {
                    if(i%3==0)
                    {
                        int a1=(i/3)+(i%3);
                        d1[a1]=a[i];
                    }
                    else if(i%3==1)
                    {
                        int a1=(i/3);
                        d2[a1]=a[i];
                    }
                    else
                    {
                        int a1=(i/3);
                        d3[a1]=a[i];
                    }
                }
                deck1_text.setText("Deck 1:");
                deck2_text.setText("Deck 2:");
                deck3_text.setText("Deck 3:");
                for(int i=0;i<d1.length;i++)
                {
                    deck1_text.setText(deck1_text.getText().toString()+"\n"+Integer.toString(d1[i]));
                    deck2_text.setText(deck2_text.getText().toString()+"\n"+Integer.toString(d2[i]));
                    deck3_text.setText(deck3_text.getText().toString()+"\n"+Integer.toString(d3[i]));
                }
                if(x==3)
                {
                    Intent i=new Intent(MainActivity.this,Result.class);
                    i.putExtra("resu",Integer.toString(a[10]));
                    x=0;
                    startActivity(i);
                }
            }
        });
    }
}
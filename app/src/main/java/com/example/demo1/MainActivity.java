package com.example.demo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mText = findViewById(R.id.text);

        mText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ListNode node = new ListNode(1);
                ListNode node1 = new ListNode(9);
                ListNode node2 = new ListNode(9);
                ListNode node3 = new ListNode(9);
                ListNode node4 = new ListNode(9);
                ListNode node5 = new ListNode(9);
                ListNode node6 = new ListNode(9);
                ListNode node7 = new ListNode(9);
                ListNode node8 = new ListNode(9);
                ListNode node9 = new ListNode(9);
                node.next = node1;
                node1.next = node2;
                node2.next = node3;
                node3.next = node4;
                node4.next = node5;
                node5.next = node6;
                node6.next = node7;
                node7.next = node8;
                node8.next = node9;


               ListNode newNode = addTwoNumbers(new ListNode(9), node);

               StringBuilder stringBuilder = new StringBuilder();
               stringBuilder.append(newNode.val);
               newNode= newNode.next;
                stringBuilder.append(newNode.val);
                newNode= newNode.next;
                stringBuilder.append(newNode.val);
                newNode= newNode.next;
                stringBuilder.append(newNode.val);
                newNode= newNode.next;
                stringBuilder.append(newNode.val);
                newNode= newNode.next;
                stringBuilder.append(newNode.val);
                newNode= newNode.next;
                stringBuilder.append(newNode.val);
                newNode= newNode.next;
                stringBuilder.append(newNode.val);
                newNode= newNode.next;
                stringBuilder.append(newNode.val);
                newNode= newNode.next;
                stringBuilder.append(newNode.val);
                newNode= newNode.next;
                stringBuilder.append(newNode.val);

               mText.setText(stringBuilder.toString());
            }
        });


    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {


        int flag = 0;

        ListNode newNode = null;
        ListNode flagNode = null;
        boolean first = true;
        int temp = 0;
        ListNode node;

        while(l1 != null || l2!=null){
            temp = 0;
            if(l1 != null){
                if(l2 != null){
                    temp = l1.val + l2.val ;
                    l2 = l2.next;
                }else{
                    temp = l1.val;
                }
                l1 = l1.next;
            }else{
                if(l2 != null){
                    temp = l2.val;
                    l2 = l2.next;
                }
            }

            temp += flag;
            node = new ListNode(temp%10);
            flag = temp/10;
            if(first) {
                newNode = node;
                flagNode = node;
                first = false;
            }else{
                flagNode.next = node;
                flagNode=node;
            }
        }

        return newNode;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

    }
}
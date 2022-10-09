#include<bits/stdc++.h>
using namespace std;

struct Node{
	int data;
  	Node* left;
  	Node* right;
  	Node(int data){
    	this->data = data;
      	left = right = NULL;
    }
};

int heightOfTree(Node* root){
	if(!root) return 0;
	
  	int leftHeight = 1 + heightOfTree(root->left);
  	int rightHeight = 1 + heightOfTree(root->right);
  	return max(leftHeight, rightHeight);
}


int main() {
/*
         1
       /    \
      2      3
    /   \   /  \
   4     5 6    7
*/
    struct Node* root = new Node(1);
  	root->left = new Node(2);
  	root->left->left = new Node(4);
  	root->left->right = new Node(5);
  	root->right = new Node(3);
  	root->right->left = new Node(6);
  	root->right->right = new Node(7);
  	cout<<heightOfTree(root);
    return 0;
}

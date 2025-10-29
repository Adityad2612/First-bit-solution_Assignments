#include<stdio.h>
#include<string.h>
#include<stdlib.h>

typedef struct book
{
	int Book_id;
	char book_name[40];
	char author_name[30];
	char category[20];
	int price;
	double rating;
	double discount;
}book;

void store(book books[],int *n);
void addbook(book books[], int *n);

void display(book books[],int n);
void removebooks(book books[],int *n);

void searchbook(book books[], int *n);
void showbook(book books[],int *n);

void updatebook(book books[],int *n);
void sortbook(book books[],int *n);

void swapping(book books[], int i, int j);

void main()   
{
	book *books = (book *)malloc(10 * sizeof(book));
	int n = 6,choice;
	
	store(books,&n);
	
	do {
        printf("\n===== Book Management System =====\n");
        printf("1. Display books\n");
        printf("2. Add a new book\n");
        printf("3. Remove a book\n");
        printf("4. Search for a book\n");
        printf("5. Show books by author or category\n");
        printf("6. Update book price, rating, or discount\n");
        printf("7. Sort books by price ,rating or discount\n");
        printf("8. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);
		getchar(); 

        switch(choice) {
            case 1:
                display(books, n);
                break;
            case 2:
                addbook(books, &n);
                break;
            case 3:
                removebooks(books, &n);
                break;
            case 4:
                searchbook(books, &n);
                break;
            case 5:
                showbook(books, &n);
                break;
            case 6:
                updatebook(books, &n);
                break;
            case 7:
                sortbook(books, &n);
                break;
            default:
                printf("Invalid choice\n");
        }
    } while(choice != 8);
}

void store(book books[],int *n)    //Book store 
{
	int i;
	books = realloc(books, (*n + 1) * sizeof(book));
    char *names[] = {"C Programming", "Why Bharat matters", "Himalayan Blunber", "Son Of Hamas", "India's Braveheart","1984"};
    char *authors[] = {"Dennis Ritchie", "S Jaishankar", "Brig J P Dalvi", "Mosab Hasan Yusuf", "Lt Gen Satish Dua","George Orwell"};
    char *categories[] = {"Programming", "Geopolitics", "History", "Auto Biography", "Story teller","Fiction"};
    int price[] = {350, 450, 299, 399, 250,299};
    double rating[] = {4.8, 4.6, 4.7, 4.9, 4.5,4.8};
    double discount[] = {10.0, 12.5, 15.0, 5.0, 20.0,20.0};

    for(i = 0; i < *n; i++) 
	{
        books[i].Book_id = i+1; 
		strcpy(books[i].book_name, names[i]);
        strcpy(books[i].author_name, authors[i]);
        strcpy(books[i].category, categories[i]);
        books[i].price = price[i];
        books[i].rating = rating[i];
        books[i].discount = discount[i];
    }
}

void addbook(book books[], int *n)    //Add book 
{
	char choice;
	do
	{
		int index = *n;

        books[index].Book_id = index + 1;

        printf("\nEnter Book Name: ");
        fgets(books[index].book_name, sizeof(books[index].book_name), stdin);  //fgets(destination, size, source);
        books[index].book_name[strcspn(books[index].book_name, "\n")] = '\0';

        printf("Enter Author Name: ");
        fgets(books[index].author_name, sizeof(books[index].author_name), stdin);
        books[index].author_name[strcspn(books[index].author_name, "\n")] = '\0';

        printf("Enter Category: ");
        fgets(books[index].category, sizeof(books[index].category), stdin);
        books[index].category[strcspn(books[index].category, "\n")] = '\0';

        printf("Enter Price: ");
        scanf("%d", &books[index].price);

        printf("Enter Rating: ");
        scanf("%lf", &books[index].rating);

        printf("Enter Discount: ");
        scanf("%lf", &books[index].discount); 

        (*n)++; 

        printf("\nDo you want to add another book? (y/n): ");
        scanf(" %c", &choice);	
	}
	while(choice == 'y' || choice == 'Y');
	
	display(books,*n);   // display after adding book
}

void display(book books[], int n)  // Display books
{
    int i;

    printf("----------------------------------------------------------------------------------------------------------\n");
    printf("| %-5s | %-20s | %-20s | %-15s | %-8s | %-6s | %-8s |\n",
           "Book ID", "Book Name", "Author", "Category", "Price", "Rating", "Discount");
    printf("----------------------------------------------------------------------------------------------------------\n");

    for (i = 0; i < n; i++)
    {
        printf("| %-5d | %-20s | %-20s | %-15s | %-8d | %-6.1lf | %-8.1lf |\n",
               books[i].Book_id, books[i].book_name, books[i].author_name,
               books[i].category, books[i].price, books[i].rating, books[i].discount);
    }
    printf("----------------------------------------------------------------------------------------------------------\n");
}

void removebooks(book books[], int *n)    // Remove book
{
    int choice;
    char again;
    
    do
    {
    	
    printf("\nRemove book by:\n");
    printf("1. Book ID\n");
    printf("2. Book Name\n");
    
    printf("Enter your choice: ");
    scanf("%d", &choice);
    getchar();   // clears the leftover '\n' from the buffer

    switch (choice)
    {
        case 1:
        {
            int index, i, j, flag = 0; //book not found

            printf("Enter Book ID to remove: ");  //remove book by id
            scanf("%d", &index);

            for (i = 0; i < *n; i++)
            {
                if (books[i].Book_id == index)   
                {
                    flag = 1;
                    for (j = i; j < *n - 1; j++)
                    {
                        books[j] = books[j + 1];
                        books[j].Book_id = j + 1;   
                    }
                    (*n)--;   // decremcent count
                    printf("\nBook with ID %d removed successfully.\n", index);
                    break;
                }
            }

            if (flag == 0)
                printf("\nBook not found\n");

            break;
        }

        case 2:
        {
            char name[40];
            int i, j, flag = 0;

            printf("Enter name of book you want to remove: "); //remove book by name
            fgets(name, sizeof(name), stdin);
            name[strcspn(name, "\n")] = '\0';

            for (i = 0; i < *n; i++)
            {
                if (strcmp(books[i].book_name, name) == 0)
                {
                    flag = 1;
                    for (j = i; j < *n - 1; j++)
                    {
                        books[j] = books[j + 1];
                        books[j].Book_id = j + 1; //updates the book ID so it matches the new order
                    }
                    (*n)--;   
                    printf("\nBook '%s' removed successfully.\n", name);
                    break;
                }
            }

            if (flag == 0)
                printf("\nBook not found\n");

            break;
        }

        default:
            printf("\nInvalid choice.\n");
    }
    printf("\nDo you want to remove another book? (y/n): ");
    scanf(" %c", &again);

    } while (again == 'y' || again == 'Y');

    display(books, *n);  //Display updated list
}

void searchbook(book books[], int *n)  
{
    int i, flag;
    char choice, again;
    char input[50], bookname[30], author[30];
    int id;

    do
    {
        printf("1. Search by Book ID\n");
        printf("2. Search by Book Name\n");
        printf("3. Search by Author Name\n");
        printf("Enter your choice : ");

        choice = getchar();
        while (getchar() != '\n');  

        flag = 0;  //to resert string
           
                //search book by index
        switch (choice)
        { 
            case '1':
                printf("Enter Book ID to search: ");
                fgets(input, sizeof(input), stdin);
                id = atoi(input);

                for (i = 0; i < *n; i++)
                {
                    if (books[i].Book_id == id)
                    {
                        flag = 1;        //book found
                        printf("----------------------------------------------------------------------------------------------------------\n");
                        printf("| %-5s | %-20s | %-20s | %-15s | %-8s | %-6s | %-8s |\n",
                        "Book ID", "Book Name", "Author", "Category", "Price", "Rating", "Discount");
                        printf("----------------------------------------------------------------------------------------------------------\n");
    
                        printf("| %-5d | %-20s | %-20s | %-15s | %-8d | %-6.1lf | %-8.1lf |\n",
                            books[i].Book_id, books[i].book_name, books[i].author_name,
                            books[i].category, books[i].price, books[i].rating, books[i].discount);
                        break;
                    }
                }
                if (flag == 0)
                    printf("Book not found.\n", id);
                break;

                //search book by name
            case '2':
                printf("Enter Book Name to search: ");
                fgets(bookname, sizeof(bookname), stdin);
                bookname[strcspn(bookname, "\n")] = 0;  

                for (i = 0; i < *n; i++)
                {
                    if (strcasecmp(books[i].book_name, bookname) == 0)
                    {
                        flag = 1;
                        printf("----------------------------------------------------------------------------------------------------------\n");
                        printf("| %-5s | %-20s | %-20s | %-15s | %-8s | %-6s | %-8s |\n",
                        "Book ID", "Book Name", "Author", "Category", "Price", "Rating", "Discount");
                        printf("----------------------------------------------------------------------------------------------------------\n");
                        
                        printf("| %-5d | %-20s | %-20s | %-15s | %-8d | %-6.1lf | %-8.1lf |\n",
                            books[i].Book_id, books[i].book_name, books[i].author_name,
                            books[i].category, books[i].price, books[i].rating, books[i].discount);
                    }
                }
                if (flag == 0)
                    printf("Book not found.\n", bookname);
                break;
                
                //search book by author
            case '3':
                printf("Enter Author Name to search: ");
                fgets(author, sizeof(author), stdin);
                author[strcspn(author, "\n")] = 0;  

                for (i = 0; i < *n; i++)
                {
                    if (strcasecmp(books[i].author_name, author) == 0)
                    {
                        flag = 1;
                        
                        printf("----------------------------------------------------------------------------------------------------------\n");
                        printf("| %-5s | %-20s | %-20s | %-15s | %-8s | %-6s | %-8s |\n",
                        "Book ID", "Book Name", "Author", "Category", "Price", "Rating", "Discount");
                        printf("----------------------------------------------------------------------------------------------------------\n");
                        
                        printf("| %-5d | %-20s | %-20s | %-15s | %-8d | %-6.1lf | %-8.1lf |\n",
                            books[i].Book_id, books[i].book_name, books[i].author_name,
                            books[i].category, books[i].price, books[i].rating, books[i].discount);
                    }
                }
                if (flag == 0)
                    printf("No books found\n", author);
                break;

            default:
                printf("Invalid choice\n");
        }

        printf("\nDo you want to search again? (y/n): ");
        again = getchar();
        while (getchar() != '\n');  

    } while (again == 'y' || again == 'Y');

    display(books, *n);
}

void showbook(book books[], int *n)  //show book
{
    int i, flag;
    char choice;
    char author[30], category[30];

    do
    {
        printf("1. Show book by Author\n");
        printf("2. Show book by Category\n");
        printf("Enter your choice: ");

        choice = getchar();
        while (getchar() != '\n');  

        flag = 0; // reset flag

        switch (choice)
        {
            case '1':
                printf("Enter author name to retrieve book: "); //retrieve book by author name
                fgets(author, sizeof(author), stdin);
                author[strcspn(author, "\n")] = 0;  

                for (i = 0; i < *n; i++)
                {
                    if (strcmp(books[i].author_name, author) == 0)
                    {
                        printf("| %-5d | %-20s | %-20s | %-15s |\n",
                            books[i].Book_id, books[i].book_name,
                            books[i].author_name, books[i].category);
                        flag = 1;
                    }
                }
                if (flag == 0)
                    printf("No books found\n", author);
                break;

            case '2':
                printf("Enter category of book to retrieve: ");  //retrieve book by category 
                fgets(category, sizeof(category), stdin);
                category[strcspn(category, "\n")] = 0;  // Remove newline

                for (i = 0; i < *n; i++)
                {
                    if (strcmp(books[i].category, category) == 0)
                    {
                        printf("| %-5d | %-20s | %-20s | %-15s |\n",
                            books[i].Book_id, books[i].book_name,
                            books[i].author_name, books[i].category);
                        flag = 1;
                    }
                }
                if (flag == 0)
                    printf("No books found\n", category);
                break;

            default:
                printf("Invalid choice\n");
        }

        printf("\nDo you want to continue showing books? (y/n): ");
        choice = getchar();
        while (getchar() != '\n');  

    } while (choice == 'y' || choice == 'Y');

    display(books, *n);
}

void updatebook(book books[], int *n)  //Update book
{
    int i, flag = 0, choice, id;
    char name[30];
    char yesno;

    do
    {
        flag = 0;
        printf("1. Update by Book ID\n");
        printf("2. Update by Book Name\n");

        printf("Enter your choice: ");
        scanf("%d", &choice);
        getchar();  

        switch (choice)
        {
            // Update rating , price and discount by book id
            case 1:
                printf("Enter Book ID to update: ");
                scanf("%d", &id);
                getchar();

                for (i = 0; i < *n; i++)
                {
                    if (books[i].Book_id == id)
                    {
                        printf("\nDo you want to update Price? (Y/N): ");
                        scanf(" %c", &yesno);
                        if (yesno == 'Y' || yesno == 'y')
                        {
                            printf("Enter new Price: ");
                            scanf("%d", &books[i].price);
                        }

                        printf("Do you want to update Rating? (Y/N): ");
                        scanf(" %c", &yesno);
                        if (yesno == 'Y' || yesno == 'y')
                        {
                            printf("Enter new Rating (0-5): ");
                            scanf("%lf", &books[i].rating);
                        }

                        printf("Do you want to update Discount? (Y/N): ");
                        scanf(" %c", &yesno);
                        if (yesno == 'Y' || yesno == 'y')
                        {
                            printf("Enter new Discount: ");
                            scanf("%lf", &books[i].discount);
                        }

                        printf("\nBook details updated successfully!\n");
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0)
                    printf("Book ID not found.\n");
                break;

            case 2:
                printf("Enter Book Name to update: ");
                fgets(name, sizeof(name), stdin);
                name[strcspn(name, "\n")] = '\0';  

                for (i = 0; i < *n; i++)
                {
                    if (strcmp(books[i].book_name, name) == 0)
                    {
                        printf("\nDo you want to update Price? (Y/N): ");
                        scanf(" %c", &yesno);
                        if (yesno == 'Y' || yesno == 'y')
                        {
                            printf("Enter new Price: ");
                            scanf("%d", &books[i].price);
                        }

                        printf("Do you want to update Rating? (Y/N): ");
                        scanf(" %c", &yesno);
                        if (yesno == 'Y' || yesno == 'y')
                        {
                            printf("Enter new Rating (0-5): ");
                            scanf("%lf", &books[i].rating);
                        }

                        printf("Do you want to update Discount? (Y/N): ");
                        scanf(" %c", &yesno);
                        if (yesno == 'Y' || yesno == 'y')
                        {
                            printf("Enter new Discount: ");
                            scanf("%lf", &books[i].discount);
                        }

                        printf("\nBook details updated successfully!\n");
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0)
                    printf("\nBook not found.\n");
                break;

            default:
                printf("Invalid choice.\n");
        }

    } while (choice != 1 && choice != 2);

    display(books, *n);
}


void sortbook(book books[], int *n)  // Book sorting
{
    int choice, order, i, j;
    char again;

    do
    {
        printf("1. Sort by Price\n");
        printf("2. Sort by Rating\n");
        printf("3. Sort by Discount\n");
        
        printf("Enter your choice: ");
        scanf("%d", &choice);

        if (choice == 1 || choice == 2 || choice == 3)
        {
            printf("Choose order:\n1. Ascending\n2. Descending\nEnter your choice: ");
            scanf("%d", &order);

            for (i = 0; i < *n - 1; i++)
            {
                for (j = 0; j < *n - 1; j++)
                {
                    if (choice == 1) // Sort by Price
                    {
                        if ((order == 1 && books[j].price > books[j + 1].price) ||
                            (order == 2 && books[j].price < books[j + 1].price))
                        {
                            swapping(books, j, j + 1);
                        }
                    }
                    else if (choice == 2) // Sort by Rating
                    {
                        if ((order == 1 && books[j].rating > books[j + 1].rating) ||
                            (order == 2 && books[j].rating < books[j + 1].rating))
                        {
                            swapping(books, j, j + 1);
                        }
                    }
                    else if (choice == 3) // Sort by Discount
                    {
                        if ((order == 1 && books[j].discount > books[j + 1].discount) ||
                            (order == 2 && books[j].discount < books[j + 1].discount))
                        {
                            swapping(books, j, j + 1);
                        }
                    }
                }
            }
            printf("\nSorted Books:\n");
            display(books, *n);
        }

        printf("\nDo you want to sort again? (y/n): ");
        scanf(" %c", &again);
        getchar();

    } while (again == 'y' || again == 'Y');
}

void swapping(book books[], int i, int j)
{
    book temp;
    temp = books[i];
    books[i] = books[j];
    books[j] = temp;
}


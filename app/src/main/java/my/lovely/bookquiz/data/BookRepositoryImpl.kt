package my.lovely.bookquiz.data

import my.lovely.bookquiz.R
import my.lovely.bookquiz.domain.model.Book
import my.lovely.bookquiz.domain.repository.BookRepository

class BookRepositoryImpl : BookRepository {

    override fun getBooks(): ArrayList<Book> {

        val nameArray = arrayListOf(
            "little_prince",
            "cell",
            "harry_potter",
            "paper_town",
            "mouse",
            "paddington",
            "ratburger",
            "dark_justice",
            "gentelmen",
            "walk_woods",
            "dog",
            "tempest",
            "pygmalion",
            "good_earth",
            "sum_fears",
            "game_of_thrones",
            "da_vinci",
            "hobbit",
            "green_mile",
            "henry_and_rybsy",
            "charlie_chocolate",

        )

        val subjectArray = arrayListOf(
            "Once when I was six years old I saw a magnificent picture in a book, called True Stories from Nature, about the primeval forest.",
            "The event that came to be known as The Pulse began at 3:03 p.m., eastern standard time, on the afternoon of October 1",
            "Harry Potter was a highly unusual boy in many ways.",
            "The way I figure it, everyone gets a miracle.",
            "Keith Gridley had been sick in bed for three days when Ralph made his appearance.",
            "Mr. Curry is in hospital.",
            "Zoe had never tasted anything so disgusting in her life.",
            "Manhattan on a dark November evening around eight o’clock was bleak and uninviting, an east wind driving heavy rain before it, as Henry Morgan turned the corner of a side street into Park Avenue.",
            "At half past six on the twenty-first of June 1922, when Count Alexander Ilyich Rostov was escorted through the gates of the Kremlin onto Red Square, it was glorious and cool",
            "Not long after I moved with my family to a small town in New Hampshire I happened upon a path that vanished into a wood on the edge of town.",
            "One day it occurred to me that the warm, squeaky, smelly things squirming around next to me were my brothers and sister.",
            "A tempestuous noise of thunder and lightning heard",
            "Eynsford Hill: How do you do?",
            "It was Wang Lung’s marriage day.",
            "It was not until he had nearly reached the outer perimeter of the stadium that the first explosion came.",
            "We should start back",
            "Renowned curator Jacques Saunière staggered through the vaulted archway of the museum’s Grand Gallery",
            "In a hole in the ground there lived a hobbit",
            "The Green Mile is the hallway with a floor of green tiles that leads to the execution chamber, and it’s called the Green Mile because the linoleum is faded and worn to a shade of tired green.",
            "Henry Huggins’s dog Ribsy was a plain ordinary city dog, the kind of dog that strangers usually called Mutt or Pooch",
            "These two very old people are the father and mother of Mr. Bucket."
        )

        val titleArray = arrayListOf(
            R.drawable.little_prince,
            R.drawable.cell,
            R.drawable.harry_potter,
            R.drawable.paper_town,
            R.drawable.mouse,
            R.drawable.paddington,
            R.drawable.ratburger,
            R.drawable.dark_justice,
            R.drawable.gentelmen,
            R.drawable.walk_woods,
            R.drawable.dog,
            R.drawable.tempest,
            R.drawable.pygmalion,
            R.drawable.good_earth,
            R.drawable.sum_fears,
            R.drawable.game_of_thronesjpg,
            R.drawable.da_vinchi,
            R.drawable.hobbit,
            R.drawable.green_mile,
            R.drawable.henry_and_rysby,
            R.drawable.charlie_and_chocolate
        )

        var booksArray = arrayListOf<Book>()

        for(i in nameArray.indices){
            booksArray.add(
                Book(
                    nameArray[i],
                    subjectArray[i],
                    titleArray[i]
                )
            )
        }

        return booksArray
    }
}
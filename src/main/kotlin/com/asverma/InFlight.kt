package com.asverma

/**
You've built an inflight entertainment system with on-demand movie streaming.

Users on longer flights like to start a second movie right when their first one ends,
but they complain that the plane usually lands before they can see the ending.
So you're building a feature for choosing two movies whose total runtimes will equal the exact flight length.

Write a method that takes an integer flightLength (in minutes) and an array of integers movieLengths (in minutes)
and returns a boolean indicating whether there are two numbers in movieLengths whose sum equals flightLength.

When building your method:

- Assume your users will watch exactly two movies
- Don't make your users watch the same movie twice
- Optimize for runtime over memory

 **/

class InFlight {
    fun calculateValidMovies(movieLengths: Array<Int>, flightTime: Int): Boolean {
        movieLengths.forEachIndexed { index, it ->
            val remainingFlightTime = flightTime - it
            for (i in index until movieLengths.size) {
                if (movieLengths[i] == remainingFlightTime) {
                    return true
                }
            }
        }
        return false
    }
}

fun main() {
    println(InFlight().calculateValidMovies(arrayOf(4, 6, 3, 8, 9, 12, 5, 2), 19))
}

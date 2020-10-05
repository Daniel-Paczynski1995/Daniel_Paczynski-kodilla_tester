package com.kodilla.stream.homework;

public class ForumStats {



        public static void main(String[] args) {
            double avg = UserRepository.getUsersList()
                    .stream()
                    .filter(u -> u.getAge() >= 40)
                    .mapToInt(u -> u.getNumberOfPosts())
                    .average()
                    .getAsDouble();
            System.out.println(avg);

            double avg2 = UserRepository.getUsersList()
                    .stream()
                    .filter(u->u.getAge()<40)
                    .mapToInt(u->u.getNumberOfPosts())
                    .average()
                    .getAsDouble();
            System.out.println(avg2);
        }
    }





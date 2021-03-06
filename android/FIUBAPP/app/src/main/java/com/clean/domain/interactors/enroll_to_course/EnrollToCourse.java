package com.clean.domain.interactors.enroll_to_course;

import com.clean.domain.interactors.Interactor;

/**
 * Created by fabrizio on 26/05/16.
 */
public interface EnrollToCourse extends Interactor {

    interface Callback {

        void onSubjectAlreadyEnrolled();

        void onMoreThanSevenCoursesEnrolled();

        void onCourseEnrolled();

        void onRetrievalFailed(String error);
    }
}

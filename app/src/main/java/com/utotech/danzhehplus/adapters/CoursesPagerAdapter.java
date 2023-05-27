package com.utotech.danzhehplus.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.utotech.danzhehplus.R;
import com.utotech.danzhehplus.model.Course;

import java.util.ArrayList;

public class CoursesPagerAdapter extends RecyclerView.Adapter<CoursesPagerVh> {
    ArrayList<Course> coursesList;
    Context context;

    public CoursesPagerAdapter(ArrayList<Course> coursesList, Context context) {
        this.coursesList = coursesList;
        this.context = context;
    }

    @NonNull
    @Override
    public CoursesPagerVh onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.pager_courses_row, parent, false);

        return new CoursesPagerVh(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CoursesPagerVh holder, int position) {
        Course course = coursesList.get(position);
        holder.txtCourseName.setText(course.getTitle());
        holder.txtDescription.setText(course.getDescription());
        holder.txtAuthorContent.setText(course.getAuthors());
        holder.numLevels.setText("Number of Levels".concat(String.valueOf(course.getNumOfLevel())));
        holder.txtLevelContent.setText(course.getLevel());
        Glide.with(context).load(course.getImage()).into(holder.imgTest);

        holder.imgTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_coursesFragment_to_contentFragment);
            }
        });
    }

    @Override
    public int getItemCount() {
        return coursesList.size();
    }
}

class CoursesPagerVh extends RecyclerView.ViewHolder {
    TextView txtCourseName, txtDescription, txtAuthorContent, numLevels, txtLevelContent;
    ImageView imgTest;
    CardView cardView;

    public CoursesPagerVh(@NonNull View itemView) {
        super(itemView);
        txtCourseName = itemView.findViewById(R.id.txtCourseName);
        txtDescription = itemView.findViewById(R.id.txtDescription);
        txtAuthorContent = itemView.findViewById(R.id.txtAuthorContent);
        numLevels = itemView.findViewById(R.id.numLevels);
        txtLevelContent = itemView.findViewById(R.id.txtLevelContent);
        imgTest = itemView.findViewById(R.id.imgTest);
        cardView = itemView.findViewById(R.id.cardView);
    }
}
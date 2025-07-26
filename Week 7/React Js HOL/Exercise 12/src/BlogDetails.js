import React from "react";

function BlogDetails() {
  const blogs = [
    { id: 1, title: "Understanding React", content: "React is a library..." },
    { id: 2, title: "JSX vs HTML", content: "JSX looks like HTML but..." }
  ];

  return (
    <div>
      <h2>Blog Details</h2>
      {blogs.map((blog) => (
        <div key={blog.id}>
          <h3>{blog.title}</h3>
          <p>{blog.content}</p>
        </div>
      ))}
    </div>
  );
}

export default BlogDetails;

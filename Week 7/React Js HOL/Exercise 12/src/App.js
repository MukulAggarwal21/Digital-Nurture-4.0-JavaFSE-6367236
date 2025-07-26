import React, { useState } from "react";
import BookDetails from "./BookDetails";
import BlogDetails from "./BlogDetails";
import CourseDetails from "./CourseDetails";

function App() {
  const [activeTab, setActiveTab] = useState("book");

  const renderComponent = () => {
    switch (activeTab) {
      case "book":
        return <BookDetails />;
      case "blog":
        return <BlogDetails />;
      case "course":
        return <CourseDetails />;
      default:
        return null;
    }
  };

  return (
    <div style={{ padding: "20px" }}>
      <h1>Blogger App</h1>
      <div>
        <button onClick={() => setActiveTab("book")}>Book Details</button>
        <button onClick={() => setActiveTab("blog")}>Blog Details</button>
        <button onClick={() => setActiveTab("course")}>Course Details</button>
      </div>
      <hr />
      {activeTab === "book" && <BookDetails />}
      {activeTab === "blog" ? <BlogDetails /> : null}
      {activeTab === "course" && renderComponent()}
    </div>
  );
}

export default App;

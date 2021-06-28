defmodule Grades do
  @moduledoc """
  Grades keeps the contexts that define your domain
  and business logic.

  Contexts are also responsible for managing your data, regardless
  if it comes from the database, an external API or others.
  """

  defmodule Calculator do
    def letter_grade(%{final: final, homework: homework, labs: labs, midterm: midterm}) do
      possible_grades = ['A+', 'A', 'A-', 'B+', 'B', 'C+', 'C', 'D+', 'D', 'E', 'F', 'EIN']
      Enum.random(possible_grades)
    end

    def percentage_grade(%{final: final, homework: homework, labs: labs, midterm: midterm}) do
      random_grade = :rand.uniform(100)
    end
  end
end
